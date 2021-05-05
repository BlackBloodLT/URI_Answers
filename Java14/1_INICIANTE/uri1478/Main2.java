package uri1478;

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

import java.io.IOException;
import java.util.Scanner;

/**
 * Este código apresenta problemas com Java 14:
 * Problema: 1478 - Matriz Quadrada II
 * Resposta: Time limit exceeded
 * Linguagem: Java 14 (OpenJDK 1.14.0) [+2s]
 * Tempo: 3.000s
 * Problema: 1478 - Matriz Quadrada II
 * Resposta: Accepted
 * Linguagem: Java 8 (OpenJDK 1.8.0) [+2s]
 * Tempo: 2.889s
 */
public class Main2 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int ordem = scanner.nextInt();
        int cont;
        while (ordem != 0) {
            for (int linha = 1; linha <= ordem; linha++) {
                cont = linha;
                for (int coluna = 1; coluna <= ordem; coluna++) {
                    if (linha == coluna) {
                        cont = 1;
                    }

                    System.out.printf("%3d", cont);
                    if (coluna < ordem) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("\n");
                    }

                    if (coluna >= linha) {
                        cont++;
                    }
                    else {
                        cont--;
                    }
                }
            }
            System.out.println("");
            ordem = scanner.nextInt();
        }
    }
}