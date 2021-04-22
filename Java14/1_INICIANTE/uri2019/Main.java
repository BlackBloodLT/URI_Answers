/**
 * Conversão de Tempo
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
 * Entrada
 * O arquivo de entrada contém um valor inteiro N.
 * Saída
 * Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */
package uri2019;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        System.out.print((N/3600) + ":");
        N = N-(N/3600)*3600;

        System.out.print((N/60) + ":");
        N = N-(N/60)*60;

        System.out.println(N);
    }
}