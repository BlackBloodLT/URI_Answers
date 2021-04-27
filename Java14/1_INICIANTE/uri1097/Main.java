/**
 * Sequencia IJ 3
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 * Entrada
 * Não há nenhuma entrada neste problema.
 * Saída
 * Imprima a sequencia conforme exemplo abaixo.
 * I=1 J=7
 * I=1 J=6
 * I=1 J=5
 * I=3 J=9
 * I=3 J=8
 * I=3 J=7
 *
 * ...
 * I=9 J=15
 * I=9 J=14
 * I=9 J=13
 */
package uri1097;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        int i = 1;
        int adicional = 0;

        while(i<=9) {

            for(int j=7 ; j>=5 ; j--) {
                System.out.println("I=" + i + " J=" + (j+adicional));
            }
            i += 2;
            adicional += 2;
        }
    }
}