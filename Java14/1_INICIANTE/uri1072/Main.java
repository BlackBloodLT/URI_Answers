/**
 * Intervalo 2
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.
 * Entrada
 * A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
 * Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 * Saída
 * Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
 */
package uri1072;

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

        int numeroCasos = scanner.nextInt();

        int contadorIn = 0;
        int contadorOut = 0;

        for (int cont=0 ; cont<numeroCasos ; cont++) {
            int valor = scanner.nextInt();

            if(valor>=10 && valor<=20) {
                contadorIn++;
            } else {
                contadorOut++;
            }
        }

        System.out.println(contadorIn + " in");
        System.out.println(contadorOut + " out");
    }
}