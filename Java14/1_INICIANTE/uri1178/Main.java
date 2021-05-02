/**
 * Preenchimento de Vetor III
 * Leia um valor X. Coloque este valor na primeira posição de um vetor N[100].
 * Em cada posição subsequente de N (1 até 99), coloque a metade do valor
 * armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.
 * Entrada
 * A entrada contem um valor de dupla precisão com 4 casas decimais.
 * Saída
 * Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do
 * vetor e Y é o valor armazenado naquela posição. Cada valor do vetor deve
 * ser apresentado com 4 casas decimais.
 */
package uri1178;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");

        double[] vetor = new double[100];
        vetor[0] = scanner.nextDouble();
        System.out.println("N[0] = " + decimalFormat.format(vetor[0]));

        for(int cont=1 ; cont<=99 ; cont++) {
            vetor[cont] = vetor[cont-1]/2;
            System.out.println("N[" + cont + "] = " + decimalFormat.format(vetor[cont]));
        }
    }
}