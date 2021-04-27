/**
 * Sequência de Números e Soma
 * Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).
 * Entrada
 * O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada vai conter um número nulo ou negativo.
 * Saída
 * Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.
 */
package uri1101;

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

        int soma = 0;

        while(true) {
            int valor1 = scanner.nextInt();
            int valor2 = scanner.nextInt();

            if(valor1<=0 || valor2<=0) {
                break;
            }

            int valorMenor = (valor1<valor2) ? valor1 : valor2;
            int valorMaior = (valor1>valor2) ? valor1 : valor2;

            for(int cont=valorMenor ; cont<=valorMaior ; cont++) {
                System.out.print(cont + " ");
                soma += cont;
            }
            System.out.println("Sum=" + soma);
            soma = 0;
        }
    }
}