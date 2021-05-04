/**
 * Matriz Quadrada I
 * Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 100),
 * correspondente a ordem de uma matriz M de inteiros, e
 * construa a matriz de acordo com o exemplo abaixo.
 * Entrada
 * A entrada consiste de vários inteiros, um valor por
 * linha, correspondentes as ordens das matrizes a serem
 * construídas. O final da entrada é marcado por um valor
 * de ordem igual a zero (0).
 * Saída
 * Para cada inteiro da entrada imprima a matriz correspondente,
 * de acordo com o exemplo. Os valores das matrizes devem ser
 * formatados em um campo de tamanho 3 justificados à direita e
 * separados por espaço. Após o último caractere de cada linha da
 * matriz não deve haver espaços em branco. Após a impressão de
 * cada matriz deve ser deixada uma linha em branco.
 */
package uri1435;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while(true) {

            int indice = scanner.nextInt();

            if(indice==0) {
                break;
            }

            int[][] matriz = new int[indice][indice];

            int contMax;

            if(indice%2==0) {
                contMax = indice/2;
            } else {
                contMax = indice/2 + 1;
            }

            for(int cont=0 ; cont<=contMax ; cont++) {
                for(int linha=0+cont ; linha<indice-cont ; linha++) {
                    for(int coluna=0+cont ; coluna<indice-cont ; coluna++) {
                        if((linha==0+cont) || (coluna==0+cont) || (linha==indice-1-cont) || (coluna==indice-1-cont)) {
                            matriz[linha][coluna] = 1+cont;
                        }
                    }
                }
            }

            int ordem = matriz.length;
            for(int linha = 0; linha < ordem; linha++){
                for(int coluna = 0; coluna < ordem; coluna++) {
                    if(coluna == (ordem-1))
                        System.out.printf("%3d",matriz[linha][coluna]);
                    else
                        System.out.printf("%3d ",matriz[linha][coluna]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}