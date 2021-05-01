/**
 * Preenchimento de Vetor II
 * Faça um programa que leia um valor T e preencha um
 * vetor N[1000] com a sequência de valores de 0 até T-1
 * repetidas vezes, conforme exemplo abaixo. Imprima o
 * vetor N.
 * Entrada
 * A entrada contém um valor inteiro T (2 ≤ T ≤ 50).
 * Saída
 * Para cada posição do vetor, escreva "N[i] = x", onde i
 * é a posição do vetor e x é o valor armazenado naquela posição.
 */
package uri1177;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[1000];

        int numeroT = scanner.nextInt();

        int i = 0;
        int aux = 0;

        while(i<=999) {
            if(aux>=numeroT) {
                aux = 0;
            }

            vetor[i] = aux;

            aux++;
            i++;
        }

        for(int cont=0 ; cont<1000 ; cont++) {
            System.out.println("N[" + cont + "] = " + vetor[cont]);
        }
    }
}