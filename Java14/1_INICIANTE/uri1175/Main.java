/**
 * Troca em Vetor I
 * Faça um programa que leia um vetor N[20].
 * Troque a seguir, o primeiro elemento com o último,
 * o segundo elemento com o penúltimo, etc., até trocar
 * o 10º com o 11º. Mostre o vetor modificado.
 * Entrada
 * A entrada contém 20 valores inteiros, positivos ou
 * negativos.
 * Saída
 * Para cada posição do vetor N, escreva "N[i] = Y", onde
 * i é a posição do vetor e Y é o valor armazenado naquela
 * posição.
 */
package uri1175;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        for(int cont=0 ; cont<=19 ; cont++) {
            vetor.add(scanner.nextInt());
        }

        for(int cont=19 ; cont>=0 ; cont--) {
            System.out.println("N[" + (19-cont) + "] = " + vetor.get(cont));
        }
    }
}