/**
 * Intervalo
 * Você deve fazer um programa que leia um valor qualquer
 * e apresente uma mensagem dizendo em qual dos seguintes
 * intervalos ([0,25], (25,50], (50,75], (75,100]) este
 * valor se encontra. Obviamente se o valor não estiver
 * em nenhum destes intervalos, deverá ser impressa a
 * mensagem “Fora de intervalo”.
 * O símbolo ( representa "maior que". Por exemplo:
 * [0,25]  indica valores entre 0 e 25.0000, inclusive eles.
 * (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
 * Entrada
 * O arquivo de entrada contém um número com ponto flutuante qualquer.
 * Saída
 * A saída deve ser uma mensagem conforme exemplo abaixo.
 */
package uri1037;

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
        double valor = scanner.nextDouble();

        if(valor>=0 && valor<=25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor>25 && valor<=50) {
            System.out.println("Intervalo (25,50]");
        } else if (valor>50 && valor<=75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor>75 && valor<=100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}