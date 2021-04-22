/**
 * Diferença
 * Leia quatro valores inteiros A, B, C e D. A seguir,
 * calcule e mostre a diferença do produto de A e B pelo
 * produto de C e D segundo a fórmula:
 * DIFERENCA = (A * B - C * D).
 * Entrada
 * O arquivo de entrada contém 4 valores inteiros.
 * Saída
 * Imprima a mensagem DIFERENCA com todas as letras
 * maiúsculas, conforme exemplo abaixo, com um espaço
 * em branco antes e depois da igualdade.
 */

package uri1007;

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

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        System.out.println("DIFERENCA = " + (A*B-C*D));
    }
}