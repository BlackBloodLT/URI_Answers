/**
 * Tabuada
 * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
 * 1 x N = N      2 x N = 2N        ...       10 x N = 10N
 * Entrada
 * A entrada contém um valor inteiro N (2 < N < 1000).
 * Saída
 * Imprima a tabuada de N, conforme o exemplo fornecido.
 */
package uri1078;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        for(int cont=1 ; cont<=10 ; cont++) {
            System.out.println(cont + " x " + numero + " = " + (cont*numero));
        }

    }
}