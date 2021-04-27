/**
 * Sequencia IJ 1
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 * Entrada
 * Não há nenhuma entrada neste problema.
 * Saída
 * Imprima a sequencia conforme exemplo abaixo
 * I=1 J=60
 * I=4 J=55
 * I=7 J=50
 * ...
 * I=? J=0
 */
package uri1095;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        int i = 1;
        int j = 60;

        while(j>=0) {
            System.out.println("I=" + i + " J=" + j);
            j -= 5;
            i += 3;
        }

    }
}