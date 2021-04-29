/**
 * Quadrado e ao Cubo
 * Escreva um programa que leia um valor inteiro N
 * (1 < N < 1000). Este N é a quantidade de linhas
 * de saída que serão apresentadas na execução do
 * programa.
 * Entrada
 * O arquivo de entrada contém um número inteiro positivo N.
 * Saída
 * Imprima a saída conforme o exemplo fornecido.
 */
package uri1143;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        DecimalFormat decimalFormat = new DecimalFormat("0");

        for(int cont=1 ; cont<=numero ; cont++) {
            System.out.println(cont + " " + decimalFormat.format(Math.pow(cont,2)) + " " + decimalFormat.format(Math.pow(cont,3)));
        }
    }
}