/**
 * Número Primo
 * Na matemática, um Número Primo é aquele que pode ser
 * dividido somente por 1 (um) e por ele mesmo. Por exemplo,
 * o número 7 é primo, pois pode ser dividido apenas pelo
 * número 1 e pelo número 7.
 * Entrada
 * A entrada contém vários casos de teste. A primeira linha
 * da entrada contém um inteiro N (1 ≤ N ≤ 100), indicando o
 * número de casos de teste da entrada. Cada uma das N linhas
 * seguintes contém um valor inteiro X (1 < X ≤ 107), que pode
 * ser ou não, um número primo.
 * Saída
 * Para cada caso de teste de entrada, imprima a mensagem
 * “X eh primo” ou “X nao eh primo”, de acordo com a especificação
 * fornecida.
 */
package uri1165;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int numeroCasos = scanner.nextInt();

        for(int cont=1 ; cont<=numeroCasos ; cont++) {

            int valor = scanner.nextInt();
            int quantidadeDivisores = 0;

            for (int cont2=1 ; cont2<=valor ; cont2++) {

                if(valor%cont2==0) {
                    quantidadeDivisores++;
                }
            }

            if(quantidadeDivisores==2) {
                System.out.println(valor + " eh primo");
            } else {
                System.out.println(valor + " nao eh primo");
            }
        }
    }
}