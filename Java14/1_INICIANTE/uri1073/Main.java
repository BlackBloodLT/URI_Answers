/**
 * Quadrado de Pares
 * Leia um valor inteiro N. Apresente o quadrado
 * de cada um dos valores pares, de 1 até N, inclusive N,
 * se for o caso.
 * Entrada
 * A entrada contém um valor inteiro N (5 < N < 2000).
 * Saída
 * Imprima o quadrado de cada um dos valores pares,
 * de 1 até N, conforme o exemplo abaixo.
 * Tome cuidado! Algumas linguagens tem por padrão
 * apresentarem como saída 1e+006 ao invés de 1000000 o
 * que ocasionará resposta errada. Neste caso, configure a
 * precisão adequadamente para que isso não ocorra.
 */

package uri1073;

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

        int valorMaximo = scanner.nextInt();

        for(int cont=1 ; cont<=valorMaximo ; cont++) {
            if(cont%2==0) {
                System.out.println( cont + "^2" + " = " + (int)(Math.pow(cont,2)));
            }
        }
    }
}