/**
 * Seis Números Ímpares
 * Leia um valor inteiro X. Em seguida apresente os 6
 * valores ímpares consecutivos a partir de X, um valor
 * por linha, inclusive o X ser for o caso.
 * Entrada
 * A entrada será um valor inteiro positivo.
 * Saída
 * A saída será uma sequência de seis números ímpares.
 */
package uri1070;

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

        int x = scanner.nextInt();

        int contadorWhile = 0;

        while(contadorWhile<6) {
            if(x%2!=0) {
                System.out.println((x));
                contadorWhile++;
            }
            x++;
        }
    }
}