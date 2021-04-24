/**
 * Números Pares
 * Faça um programa que mostre os números pares entre 1 e 100, inclusive.
 * Entrada
 * Neste problema extremamente simples de repetição não há entrada.
 * Saída
 *  Imprima todos os números pares entre 1 e 100, inclusive se for o caso,
 *  um em cada linha.
 */
package uri1059;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        for (int cont=1 ; cont<=100; cont++)
        {
            if(cont%2==0) {
                System.out.println(cont);
            }
        }
    }
}