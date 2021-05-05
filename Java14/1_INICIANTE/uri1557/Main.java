/**
 * Matriz Quadrada III
 * Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 15),
 * correspondente a ordem de uma matriz M de inteiros, e
 * construa a matriz de acordo com o exemplo abaixo.
 * Entrada
 * A entrada consiste de vários inteiros, um valor por linha,
 * correspondentes as ordens das matrizes a serem construídas.
 * O final da entrada é marcado por um valor de ordem igual a
 * zero (0).
 * Saída
 * Para cada inteiro da entrada imprima a matriz correspondente,
 * de acordo com o exemplo. Os valores das matrizes devem ser
 * formatados em um campo de tamanho T justificados à direita
 * e separados por espaço, onde T é igual ao número de dígitos
 * do maior número da matriz. Após o último caractere de cada
 * linha da matriz não deve haver espaços em branco. Após a
 * impressão de cada matriz deve ser deixada uma linha em branco.
 */
package uri1557;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while(true) {

            int ordem = scanner.nextInt();

            if(ordem==0) {
                break;
            }

            int[][] matriz = new int[ordem][ordem];

            for(int linha=0 ; linha<ordem ; linha++) {
                for(int coluna=0 ; coluna<ordem ; coluna++) {
                    matriz[linha][coluna] = (int)(Math.pow(2,linha+coluna));
                }
            }

            for (int linha=1 ; linha<=ordem ; linha++) {
                for (int coluna=1 ; coluna<=ordem ; coluna++) {
                    System.out.printf("%"+ String.valueOf(matriz[ordem-1][ordem-1]).length() +"d", matriz[linha-1][coluna-1]);
                    if (coluna<ordem) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.println("");
                    }
                }
            }
            System.out.println("");
        }
    }
}