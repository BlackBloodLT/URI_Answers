/**
 * Crescente e Decrescente
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
 * Entrada
 * A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.
 * Saída
 * Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.
 */
package uri1113;

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
        int numero1;
        int numero2;

        while(true) {
            numero1 = scanner.nextInt();
            numero2 = scanner.nextInt();

            if(numero1==numero2) {
                break;
            }

            if(numero1<numero2) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
        }
    }
}