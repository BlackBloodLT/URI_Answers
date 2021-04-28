/**
 * PUM
 * Escreva um programa que leia um valor inteiro N.
 * Este N é a quantidade de linhas de saída que serão
 * apresentadas na execução do programa.
 * Entrada
 * O arquivo de entrada contém um número inteiro positivo N.
 * Saída
 * Imprima a saída conforme o exemplo fornecido.
 */
package uri1142;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat(".0");

        int numero = scanner.nextInt();
        int aux = 1;

        for(int cont=1 ; cont<=numero ; cont++) {
            for(int cont2=1 ; cont2<=3 ; cont2++) {
                System.out.print(aux + " ");
                aux++;
            }
            System.out.println("PUM");
            aux++;
        }
    }
}