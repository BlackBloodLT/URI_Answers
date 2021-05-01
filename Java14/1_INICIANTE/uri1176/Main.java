/**
 * Fibonacci em Vetor
 * Faça um programa que leia um valor e apresente o
 * número de Fibonacci correspondente a este valor lido.
 * Lembre que os 2 primeiros elementos da série de Fibonacci
 * são 0 e 1 e cada próximo termo é a soma dos 2 anteriores
 * a ele. Todos os valores de Fibonacci calculados neste problema
 * devem caber em um inteiro de 64 bits sem sinal.
 * Entrada
 * A primeira linha da entrada contém um inteiro T,
 * indicando o número de casos de teste. Cada caso
 * de teste contém um único inteiro N (0 ≤ N ≤ 60),
 * correspondente ao N-esimo termo da série de Fibonacci.
 * Saída
 * Para cada caso de teste da entrada, imprima a
 * mensagem "Fib(N) = X", onde X é o N-ésimo termo da série
 * de Fibonacci.
 */
package uri1176;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Long> vetorFib = new ArrayList<Long>();

        vetorFib.add(0L);
        vetorFib.add(1L);

        for(int cont=2 ; cont<=60 ; cont++) {
            vetorFib.add(vetorFib.get(cont-1) + vetorFib.get(cont-2));
        }

        int numeroCasos = scanner.nextInt();

        for(int cont=1 ; cont<=numeroCasos ; cont++) {
            int indiceVetor = scanner.nextInt();
            System.out.println("Fib(" + indiceVetor + ") = " + vetorFib.get(indiceVetor));
        }
    }
}