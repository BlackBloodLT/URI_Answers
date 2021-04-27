/**
 * Resto 2
 * Leia um valor inteiro N. Apresente todos os números
 * entre 1 e 10000 que divididos por N dão resto igual a 2.
 * Entrada
 * A entrada contém um valor inteiro N (N < 10000).
 * Saída
 * Imprima todos valores que quando divididos por N dão
 * resto = 2, um por linha.
 */
package uri1075;

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

        for(int cont=1 ; cont<=10000 ; cont++) {
            if(cont%numero==2) {
                System.out.println(cont);
            }
        }
    }
}