/**
 * Sequencia IJ 2
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 * Entrada
 * Não há nenhuma entrada neste problema.
 * Saída
 * Imprima a sequencia conforme exemplo abaixo
 * I=1 J=7
 * I=1 J=6
 * I=1 J=5
 * I=3 J=7
 * I=3 J=6
 * I=3 J=5
 * ...
 * I=9 J=7
 * I=9 J=6
 * I=9 J=5
 */
package uri1096;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        int i = 1;

        while(i<=9) {
            int j = 7;
            System.out.println("I=" + i + " J=" + j);
            System.out.println("I=" + i + " J=" + (j-1));
            System.out.println("I=" + i + " J=" + (j-2));
            i += 2;
        }
    }
}