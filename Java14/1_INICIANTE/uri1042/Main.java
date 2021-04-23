/**
 * Sort Simples
 * Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
 * Entrada
 * A entrada contem três números inteiros.
 * Saída
 * Imprima a saída conforme foi especificado.
 */
package uri1042;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        ArrayList<Integer> vetor = new ArrayList();
        vetor.add(valor1);
        vetor.add(valor2);
        vetor.add(valor3);

        Collections.sort(vetor);
        System.out.println(vetor.get(0));
        System.out.println(vetor.get(1));
        System.out.println(vetor.get(2));

        System.out.println("");

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
    }
}