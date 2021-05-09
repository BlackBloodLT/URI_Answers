/**
 * Conta
 * Dois amigos pedem ao atendente de uma lanchonete
 * propor um desafio, de modo que quem acertasse mais,
 * não precisaria pagar a conta. Então foi proposto
 * o seguinte: Dado o seguinte somatório abaixo,
 * informar o resultado, com uma quantidade de termos
 * no mesmo:
 * S = 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 ...
 * Escreva um programa que, dada uma quantidade de
 * termos, informar o resultado do somatório acima.
 * Entrada
 * Um número inteiro C será informado, que será a
 * quantidade de casos de teste. Cada caso de teste
 * inicia com um número inteiro N (1 ≤ N ≤ 1000),
 * indicando a quantidade de termos da soma.
 * Saída
 * Para cada caso de teste imprima um número S, que
 * é o resultado da soma dos N termos da expressão.
 */
package uri1866;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numeroCasos = scanner.nextInt();

        for(int cont=1 ; cont<=numeroCasos ; cont++) {

            int valor = scanner.nextInt();
            if(valor%2==0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}