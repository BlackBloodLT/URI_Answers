/**
 * Produto Simples
 * Leia dois valores inteiros. A seguir, calcule o produto
 * entre estes dois valores e atribua esta operação à variável
 * PROD. A seguir mostre a variável PROD com mensagem correspondente.
 * Entrada
 * O arquivo de entrada contém 2 valores inteiros.
 * Saída
 * Imprima a mensagem "PROD" e a variável PROD conforme exemplo
 * abaixo, com um espaço em branco antes e depois da igualdade.
 * Não esqueça de imprimir o fim de linha após o produto, caso
 * contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

package uri1004;

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

        System.out.println("PROD = " + (A*B));
    }
}