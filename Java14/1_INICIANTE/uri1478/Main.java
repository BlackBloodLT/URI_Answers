/**
 * Matriz Quadrada II
 * Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 100),
 * correspondente a ordem de uma matriz M de inteiros, e
 * construa a matriz de acordo com o exemplo abaixo.
 * Entrada
 * A entrada consiste de vários inteiros, um valor por linha,
 * correspondentes as ordens das matrizes a serem construídas.
 * O final da entrada é marcado por um valor de ordem igual a
 * zero (0).
 * Saída
 * Para cada inteiro da entrada imprima a matriz correspondente,
 * de acordo com o exemplo. (os valores das matrizes devem ser
 * formatados em um campo de tamanho 3 justificados à direita e
 * separados por espaço. Após o último caractere de cada linha
 * da matriz não deve haver espaços em branco. Após a impressão
 * de cada matriz deve ser deixada uma linha em branco.
 */
package uri1478;

import java.io.IOException;
import java.util.Scanner;

/**
 * Este código apresenta problemas com Java 14:
 * Problema: 1478 - Matriz Quadrada II
 * Resposta: Time limit exceeded
 * Linguagem: Java 14 (OpenJDK 1.14.0) [+2s]
 * Tempo: 3.000s
 * Problema: 1478 - Matriz Quadrada II
 * Resposta: Time limit exceeded
 * Linguagem: Java 8 (OpenJDK 1.8.0) [+2s]
 * Tempo: 3.000s
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int ordem = scanner.nextInt();
        int linha;
        int coluna;
        int cont;

        while(ordem!=0) {

            int[][] matriz = new int[ordem][ordem];

            for(cont=0 ; cont<ordem ; cont++) {
                for(linha=cont ; linha<ordem ; linha++) {
                    for(coluna=cont ; coluna<ordem ; coluna++) {
                        if(linha<coluna) {
                            matriz[linha][coluna] = matriz[linha][coluna-1]+1;
                        } else if(linha>coluna) {
                            matriz[linha][coluna] = matriz[linha-1][coluna]+1;
                        } else if(linha==coluna) {
                            matriz[linha][coluna] = 1;
                        }
                    }
                }
            }

            for(linha=0; linha<ordem ; linha++){
                for(coluna=0; coluna<ordem ; coluna++) {
                    System.out.printf("%3d", matriz[linha][coluna]);
                    if(coluna!=(ordem-1)) {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            System.out.println("");

            ordem = scanner.nextInt();
        }
    }
}