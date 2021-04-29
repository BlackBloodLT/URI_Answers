/**
 * Sequência Lógica 2
 * Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.
 * Entrada
 * O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).
 * 3 99
 * Saída
 * Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 10 11 12
 * ...
 * 97 98 99
 */
package uri1145;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int pulo = scanner.nextInt();
        int valorMax = scanner.nextInt();

        int contPulos;

        for(int cont=1 ; cont<=valorMax ; cont+=pulo) {
            for(contPulos=0 ; contPulos<pulo ; contPulos++ ) {
                if((cont+contPulos)<=valorMax) {
                    System.out.print((cont + contPulos));
                }
                if(((cont+contPulos)<(cont+pulo-1)) && ((cont+contPulos)<valorMax)) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}