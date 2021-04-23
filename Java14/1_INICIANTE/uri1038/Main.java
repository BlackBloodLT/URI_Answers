/**
 * Lanche
 * Com base na tabela abaixo, escreva um programa
 * que leia o código de um item e a quantidade deste
 * item. A seguir, calcule e mostre o valor da conta
 * a pagar.
 * Entrada
 * O arquivo de entrada contém dois valores inteiros
 * correspondentes ao código e à quantidade de um
 * item conforme tabela acima.
 * Saída
 * O arquivo de saída deve conter a mensagem "Total:
 * R$ " seguido pelo valor a ser pago, com 2 casas
 * após o ponto decimal.
 */
package uri1038;

import java.io.IOException;
import java.text.DecimalFormat;
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
        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        switch(codigo) {
            case 1: {
                System.out.println("Total: R$ " + decimalFormat.format(quantidade*4.00));
                break;
            }
            case 2: {
                System.out.println("Total: R$ " + decimalFormat.format(quantidade*4.50));
                break;
            }
            case 3: {
                System.out.println("Total: R$ " + decimalFormat.format(quantidade*5.00));
                break;
            }
            case 4: {
                System.out.println("Total: R$ " + decimalFormat.format(quantidade*2.00));
                break;
            }
            case 5: {
                System.out.println("Total: R$ " + decimalFormat.format(quantidade*1.50));
                break;
            }
            default: {
                break;
            }
        }
    }
}