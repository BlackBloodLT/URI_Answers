/**
 * Fatorial Simples
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 * Entrada
 * A entrada contém um valor inteiro N (0 < N < 13).
 * Saída
 * A saída contém um valor inteiro, correspondente ao fatorial de N.
 */
package uri1153;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int prod = 1;

        if(valor==0) {
            System.out.println(1);
        } else {
            for(int cont=1 ; cont<=valor ; cont++) {
                prod *=cont;
            }
        }

        System.out.println(prod);
    }
}