/**
 * Dividindo X por Y
 * Escreva um algoritmo que leia 2 números e imprima
 * o resultado da divisão do primeiro pelo segundo.
 * Caso não for possível mostre a mensagem “divisao
 * impossivel” para os valores em questão.
 * Entrada
 * A entrada contém um número inteiro N. Este N será
 * a quantidade de pares de valores inteiros (X e Y)
 * que serão lidos em seguida.
 * Saída
 * Para cada caso mostre o resultado da divisão com
 * um dígito após o ponto decimal, ou “divisao impossivel”
 * caso não seja possível efetuar o cálculo.
 * Obs.: Cuide que a divisão entre dois inteiros em
 * algumas linguagens como o C e C++ gera outro inteiro.
 * Utilize cast :)
 */
package uri1116;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);

        int valor1;
        int valor2;

        int numeroIteracoes = scanner.nextInt();

        for(int cont=1 ; cont<=numeroIteracoes ; cont++) {
            valor1 = scanner.nextInt();
            valor2 = scanner.nextInt();

            if(valor2==0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println((double)valor1/valor2);
            }
        }
    }
}