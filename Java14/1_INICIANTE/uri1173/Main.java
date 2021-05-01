/**
 * Preenchimento de Vetor I
 * Leia um valor e faça um programa que coloque o valor
 * lido na primeira posição de um vetor N[10]. Em cada
 * posição subsequente, coloque o dobro do valor da posição
 * anterior. Por exemplo, se o valor lido for 1, os
 * valores do vetor devem ser 1,2,4,8 e assim sucessivamente.
 * Mostre o vetor em seguida.
 * Entrada
 * A entrada contém um valor inteiro (V<=50).
 * Saída
 * Para cada posição do vetor, escreva "N[i] = X", onde i é
 * a posição do vetor e X é o valor armazenado na posição i.
 * O primeiro número do vetor N (N[0]) irá receber o valor
 * de V.
 */
package uri1173;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        int valorInicial = scanner.nextInt();
        vetor.add(valorInicial);
        System.out.println("N[0] = " + valorInicial);

        for(int cont=1 ; cont<=9 ; cont++) {
            vetor.add(vetor.get(cont-1) * 2);
            System.out.println("N[" + cont + "] = " + vetor.get(cont));
        }
    }
}