/**
 * Pares entre Cinco Números
 * Faça um programa que leia 5 valores inteiros.
 * Conte quantos destes valores digitados são pares
 * e mostre esta informação.
 * Entrada
 * O arquivo de entrada contém 5 valores inteiros
 * quaisquer.
 * Saída
 * Imprima a mensagem conforme o exemplo fornecido,
 * indicando a quantidade de valores pares lidos.
 */
package uri1065;

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

        int contadoresPares = 0;

        for(int cont=0 ; cont<5 ; cont++) {
            vetor.add(scanner.nextInt());
        }

        for(int elemento : vetor) {
            if(elemento%2==0) {
                contadoresPares++;
            }
        }

        System.out.println(contadoresPares + " valores pares");
    }
}