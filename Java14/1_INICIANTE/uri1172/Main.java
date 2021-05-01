/**
 * Substituição em Vetor I
 * Faça um programa que leia um vetor X[10]. Substitua a seguir,
 * todos os valores nulos e negativos do vetor X por 1. Em seguida
 * mostre o vetor X.
 * Entrada
 * A entrada contém 10 valores inteiros, podendo ser positivos ou
 * negativos.
 * Saída
 * Para cada posição do vetor, escreva "X[i] = x", onde i é a posição
 * do vetor e x é o valor armazenado naquela posição.
 */
package uri1172;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        for(int cont=1 ; cont<=10  ; cont++) {
            int valor = scanner.nextInt();
            if(valor>0) {
                vetor.add(valor);
            } else if(valor<=0) {
                vetor.add(1);
            }
        }

        for(int cont=0 ; cont<=9 ; cont++) {
            System.out.println("X[" + cont + "] = " + vetor.get(cont));
        }
    }
}