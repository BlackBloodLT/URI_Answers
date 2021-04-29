/**
 * Fibonacci Fácil
 * A seguinte sequência de números 0 1 1 2 3 5 8 13 21...
 * é conhecida como série de Fibonacci. Nessa sequência,
 * cada número, depois dos 2 primeiros, é igual à soma dos
 * 2 anteriores. Escreva um algoritmo que leia um inteiro
 * N (N < 46) e mostre os N primeiros números dessa série.
 * Entrada
 * O arquivo de entrada contém um valor inteiro N (0 < N < 46).
 * Saída
 * Os valores devem ser mostrados na mesma linha, separados
 * por um espaço em branco. Não deve haver espaço após o último valor.
 */
package uri1151;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = scanner.nextInt();

        int somaAtual = 0;
        int valorAnterior = 0;
        int valorPosterior = 1;

        if(quantidadeNumeros==0) {
            System.out.println(valorAnterior);
        } else if(quantidadeNumeros==1) {
            System.out.println(valorAnterior + " " + valorPosterior);
        } else {
            for(int cont=1 ; cont<=quantidadeNumeros ; cont++) {
                System.out.print(valorAnterior);

                if(cont<quantidadeNumeros) {
                    System.out.print(" ");
                }

                somaAtual = valorPosterior+valorAnterior;
                valorAnterior = valorPosterior;
                valorPosterior = somaAtual;
            }
        }
        System.out.println("");
    }
}