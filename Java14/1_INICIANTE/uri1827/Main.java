/**
 * Matriz Quadrada IV
 * Neste programa seu trabalho é ler um valor inteiro
 * que será o tamanho da matriz quadrada (largura e
 * altura) que será preenchida da seguinte forma: a
 * parte externa é preenchida com 0, a parte interna
 * é preenchida com 1, a diagonal principal é preenchida
 * com 2, a diagonal secundária é preenchida com 3 e o
 * ponto central contém o valor 4, conforme os exemplos
 * abaixo.
 * Obs: o quadrado com '1' sempre começa na posição
 * tamanho/3, tanto na largura quanto quanto na altura.
 * A linha e a coluna começam em zero (0).
 * Entrada
 * A entrada contém vários casos de teste e termina com
 * EOF (fim de arquivo. Cada caso de teste consiste de
 * um valor inteiro ímpar N (5 ≤ N ≤ 101) que é o tamanho
 * da matriz.
 * Saída
 * Para cada caso de teste, imprima a matriz correspondente
 * conforme o exemplo abaixo. Após cada caso de teste,
 * imprima uma linha em branco.
 */
package uri1827;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int centro;
        int interior;
        int exterior;

        while(scanner.hasNext()) {

            int ordem = scanner.nextInt();

            centro = ordem/2;
            interior = ordem/3;
            exterior = (ordem - 1) - interior;

            for(int linha=0; linha<ordem; linha++) {
                for(int coluna=0; coluna<ordem; coluna++) {
                    if(linha==centro && coluna==centro) {
                        System.out.print(4);
                    } else if((linha>=interior) && (coluna>=interior) && (linha<=exterior) && (coluna<=exterior)) {
                        System.out.print(1);
                    } else if(linha==coluna) {
                        System.out.print(2);
                    }
                    else if(coluna==ordem-linha-1) {
                        System.out.print(3);
                    }
                    else {
                        System.out.print(0);
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}