/**
 * O Maior
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.
 * Entrada
 * O arquivo de entrada contém três valores inteiros.
 * Saída
 * Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

package uri1013;

import java.io.IOException;
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

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maiorABC = (maiorAB+c+Math.abs(maiorAB-c))/2;

        System.out.println(maiorABC + " eh o maior");
    }
}