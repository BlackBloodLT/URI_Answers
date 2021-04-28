/**
 * Múltiplos de 13
 * Escreva um algoritmo que leia 2 valores inteiros
 * X e Y calcule a soma dos números que não são
 * múltiplos de 13 entre X e Y, incluindo ambos.
 * Entrada
 * O arquivo de entrada contém 2 valores inteiros
 * quaisquer, não necessariamente em ordem crescente.
 * Saída
 * Imprima a soma de todos os valores não divisíveis
 * por 13 entre os dois valores lidos na entrada,
 * inclusive ambos se for o caso.
 */
package uri1132;

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
        int soma = 0;

        int valorMin = (valor1<valor2) ? valor1 : valor2;
        int valorMax = (valor1>valor2) ? valor1 : valor2;

        for(int cont=valorMin ; cont<=valorMax ; cont++) {
            if(cont%13!=0) {
                soma += cont;
            }
        }

        System.out.println(soma);
    }
}