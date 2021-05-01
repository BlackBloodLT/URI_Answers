/**
 * Seleçao em Vetor I
 * Faça um programa que leia um vetor A[100]. No final,
 * mostre todas as posições do vetor que armazenam um
 * valor menor ou igual a 10 e o valor armazenado em
 * cada uma das posições.
 * Entrada
 * A entrada contém 100 valores, podendo ser inteiros,
 * reais, positivos ou negativos.
 * Saída
 * Para cada valor do vetor menor ou igual a 10, escreva
 * "A[i] = x", onde i é a posição do vetor e x é o valor
 * armazenado na posição, com uma casa após o ponto decimal.
 */
package uri1174;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> vetor = new ArrayList<Double>();
        DecimalFormat df = new DecimalFormat("0.0");// No programa não foi necessário usar, mas fica a dica

        for(int cont=0 ; cont<=99 ; cont++) {
            vetor.add(scanner.nextDouble());
            if(vetor.get(cont)<=10) {
                System.out.println("A[" + cont + "] = " + vetor.get(cont));
            }
        }
    }
}
