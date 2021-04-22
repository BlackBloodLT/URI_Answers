/**
 * Extremamente Básico
 * Leia 2 valores inteiros e armazene-os nas variáveis A e B.
 * Efetue a soma de A e B atribuindo o seu resultado na variável X.
 * Imprima X conforme exemplo apresentado abaixo. Não apresente
 * mensagem alguma além daquilo que está sendo especificado
 * e não esqueça de imprimir o fim de linha após o resultado,
 * caso contrário, você receberá "Presentation Error".
 * Entrada *
 * A entrada contém 2 valores inteiros.
 * Saída
 * Imprima a mensagem "X = " (letra X maiúscula) seguido pelo
 * valor da variável X e pelo final de linha. Cuide para que
 * tenha um espaço antes e depois do sinal de igualdade, conforme
 * o exemplo abaixo.
 */

package uri1001;

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
        System.out.println("X = " + (A+B));
    }
}