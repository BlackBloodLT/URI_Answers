/**
 * Soma de Impares Consecutivos I
 * Leia 2 valores inteiros X e Y. A seguir, calcule
 * e mostre a soma dos números impares entre eles.
 * Entrada
 * O arquivo de entrada contém dois valores inteiros.
 * Saída
 * O programa deve imprimir um valor inteiro. Este valor
 * é a soma dos valores ímpares que estão entre os valores
 * fornecidos na entrada que deverá caber em um inteiro.
 */

package uri1071;

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
        int y = scanner.nextInt();

        int menor = x<=y ? x : y;
        int maior = x>y ? x : y;

        int soma = 0;

        for(int cont=menor+1 ; cont<maior ; cont++) {
            if(cont%2!=0) {
                soma += cont;
            }
        }

        System.out.println(soma);
    }
}