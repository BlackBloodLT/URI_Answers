/**
 * Números Ímpares
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida
 * mostre os ímpares de 1 até X, um valor por linha,
 * inclusive o X, se for o caso.
 * Entrada
 * O arquivo de entrada contém 1 valor inteiro qualquer.
 * Saída
 * Imprima todos os valores ímpares de 1 até X, inclusive
 * X, se for o caso.
 */
package uri1067;

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

        for(int cont=1 ; cont<=x ; cont++) {
            if(cont%2!=0) {
                System.out.println(cont);
            }
        }
    }
}