/**
 * Maior e Posição
 * Leia 100 valores inteiros. Apresente então o maior
 * valor lido e a posição dentre os 100 valores lidos.
 * Entrada
 * O arquivo de entrada contém 100 números inteiros,
 * positivos e distintos.
 * Saída
 * Apresente o maior valor lido e a posição de entrada,
 * conforme exemplo abaixo.
 */
package uri1080;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        for(int cont=0 ; cont<100 ; cont++) {
            vetor.add(scanner.nextInt());
        }

        int maiorElemento = vetor.get(0);
        int indiceMaiorElemento = 0;
        for(int elemento : vetor) {
            if(maiorElemento<elemento) {
                maiorElemento = elemento;
                indiceMaiorElemento = vetor.indexOf(elemento);
            }
        }
        System.out.println(maiorElemento);
        System.out.println(indiceMaiorElemento+1);
    }
}