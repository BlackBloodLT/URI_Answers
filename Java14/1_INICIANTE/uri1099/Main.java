/**
 * Soma de Ímpares Consecutivos II
 * Leia um valor inteiro N que é a quantidade de casos
 * de teste que vem a seguir. Cada caso de teste consiste
 * de dois inteiros X e Y. Você deve apresentar a soma
 * de todos os ímpares existentes entre X e Y.
 * Entrada
 * A primeira linha de entrada é um inteiro N que é a
 * quantidade de casos de teste que vem a seguir. Cada
 * caso de teste consiste em uma linha contendo dois
 * inteiros X e Y.
 * Saída
 * Imprima a soma de todos valores ímpares entre X e Y.
 */
package uri1099;

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
        int soma = 0;

        for(int cont=0 ; cont<numero ; cont++) {
            int valor1 = scanner.nextInt();
            int valor2 = scanner.nextInt();
            int menor = (valor1<valor2) ? valor1 : valor2;
            int maior = (valor1>valor2) ? valor1 : valor2;

            for(int cont2=menor+1 ; cont2<maior ; cont2++) {
                if(cont2%2!=0) {
                    soma += cont2;
                }
            }
            System.out.println(soma);
            soma = 0;
        }
    }
}