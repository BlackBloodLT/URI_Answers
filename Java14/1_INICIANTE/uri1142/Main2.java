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
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int aux = 1;

        for(int cont=1 ; cont<=numero ; cont++) {
            for(int cont2=1 ; cont2<=4 ; cont2++) {
                if(aux%4!=0) {
                    System.out.print(aux + " ");
                } else if(aux%4==0) {
                    System.out.println("PUM");
                }
                aux++;
            }
        }
    }
}