/**
 * Múltiplos
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
 * Entrada
 * A entrada contém valores inteiros.
 * Saída
 * A saída deve conter uma das mensagens conforme descrito acima.
 */
package uri1044;

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
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        if(valor2%valor1==0) {
            System.out.println("Sao Multiplos");
        } else if(valor1%valor2==0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}