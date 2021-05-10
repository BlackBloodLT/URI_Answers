/**
 * Jornada nas Estrelas
 * Após comprar vários sítios adjacentes na região do oeste
 * catarinense, a família Estrela construiu uma única estrada
 * que passa por todos os sítios em sequência. O primeiro
 * sítio da sequência foi batizado de Estrela 1, o segundo
 * de Estrela 2, e assim por diante. Porém, o irmão que vive
 * em Estrela 1 acabou enlouquecendo e resolveu fazer uma
 * Jornada nas Estrelas para roubar carneiros das propriedades
 * de seus irmãos. Mas ele está definitivamente pirado.
 * Quando passa pelo sítio Estrela i, ele rouba apenas um
 * carneiro daquele sítio (se o sítio tem algum) e segue ou
 * para Estrela i + 1 ou para Estrela i - 1, dependendo se o
 * número de carneiros em Estrela i era, respectivamente, ímpar
 * ou par. Se não existe a Estrela para a qual ele deseja seguir,
 * ele interrompe sua jornada. O irmão louco começa sua Jornada
 * em Estrela 1, roubando um carneiro do seu próprio sítio.
 * Entrada
 * A primeira linha da entrada consiste de um único inteiro N
 * (1 ≤ N ≤ 106), o qual representa o número de Estrelas. A segunda
 * linha da entrada consiste de N inteiros, de modo que o i-ésimo
 * inteiro, Xi (1 ≤ Xi ≤ 106), representa o número inicial de
 * carneiros em Estrela i.
 * Saída
 * Imprima uma linha contendo dois inteiros, de modo que o primeiro
 * represente o número de Estrelas atacadas pelo irmão louco e o
 * segundo represente o número total de carneiros não roubados.
 */
package uri1973;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int numeroCasos = scanner.nextInt();

        int[] estrela = new int[numeroCasos];
        int[] carneiro = new int[numeroCasos];

        long totalEstrela = 0;
        long totalCarneiro = 0;

        for (int cont=0 ; cont<numeroCasos; cont++) {
            carneiro[cont] = scanner.nextInt();
            estrela[cont] = 0;
        }

        int i = 0;

        while (true) {
            if (i==0 && carneiro[i]%2==0){
                estrela[i] = 1;
                if (carneiro[i]>0) carneiro[i]--;
                break;
            } else if (i==(numeroCasos-1) && carneiro[i]%2==1) {
                estrela[i] = 1;
                if (carneiro[i]>0) {
                    carneiro[i]--;
                }
                break;
            } else if (carneiro[i] % 2 == 1) {
                if (carneiro[i]>0) {
                    carneiro[i]--;
                }
                estrela[i] = 1;
                i++;
            } else if (carneiro[i] % 2 == 0) {
                estrela[i] = 1;
                if (carneiro[i]>0) {
                    carneiro[i]--;
                }
                i--;
            }
        }

        for (int cont=0 ; cont<numeroCasos; cont++) {
            totalCarneiro += carneiro[cont];
            totalEstrela += estrela[cont];
        }

        System.out.println(totalEstrela + " " + totalCarneiro);
    }
}