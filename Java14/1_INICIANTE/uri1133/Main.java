/**
 * Resto da Divisão
 * Escreva um programa que leia 2 valores X e Y e
 * que imprima todos os valores entre eles cujo resto
 * da divisão dele por 5 for igual a 2 ou igual a 3.
 * Entrada
 * O arquivo de entrada contém 2 valores positivos
 * inteiros quaisquer, não necessariamente em ordem
 * crescente.
 * Saída
 * Imprima todos os valores conforme exemplo abaixo,
 * sempre em ordem crescente.
 */
package uri1133;

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

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        int valorMin = (valor1<valor2) ? valor1 : valor2;
        int valorMax = (valor1>valor2) ? valor1 : valor2;

        for(int cont=valorMin+1 ; cont<valorMax ; cont++) {
            if(cont%5==2 || cont%5==3) {
                System.out.println(cont);
            }
        }
    }
}