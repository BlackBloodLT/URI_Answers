/**
 * Polígonos Regulares Simples
 * Na geometria Euclidiana, um polígono regular é um
 * polígono em que todos os ângulos são iguais e todos
 * os lados tem o mesmo comprimento. Um polígono simples
 * é aquele cujos segmentos de reta não se interceptam.
 * Abaixo pode-se ver vários mosaicos feitos por polígonos
 * regulares.
 * Você deve escrever um programa que, dados o número e
 * o comprimento dos lados de um polígono regular, mostre
 * seu perímetro.
 * Entrada
 * A entrada tem dois inteiros positivos: N e L, que são,
 * respectivamente, o número de lados e o comprimento de
 * cada lado de um polígono regular (3 ≤ N ≤ 1000000 and
 * 1 ≤ L ≤ 4000).
 * Saída
 * A saída é o perímetro P do polígono regular em uma única
 * linha.
 */
package uri1959;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        // long produto = scanner.nextLong();
        // produto *= scanner.nextLong();

        long produto = scanner.nextLong() * scanner.nextLong();
        System.out.println(produto);
    }
}