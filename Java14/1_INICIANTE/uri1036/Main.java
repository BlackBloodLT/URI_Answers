/**
 * Fórmula de Bhaskara
 * Leia 3 valores de ponto flutuante e efetue o
 * cálculo das raízes da equação de Bhaskara.
 * Se não for possível calcular as raízes, mostre
 * a mensagem correspondente “Impossivel calcular”,
 * caso haja uma divisão por 0 ou raiz de numero
 * negativo.
 * Entrada
 * Leia três valores de ponto flutuante (double)
 * A, B e C.
 * Saída
 *  Se não houver possibilidade de calcular as raízes,
 *  apresente a mensagem "Impossivel calcular". Caso
 *  contrário, imprima o resultado das raízes com 5
 *  dígitos após o ponto, com uma mensagem correspondente
 *  conforme exemplo abaixo. Imprima sempre o final de
 *  linha após cada mensagem.
 */
package uri1036;

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
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        DecimalFormat decimalFormat = new DecimalFormat("0.00000");

        double delta = b*b-4*a*c;

        if(delta>=0 && a!=0) {
            double R1 = (float)((-b+Math.sqrt(delta))/(2*a));
            System.out.println("R1 = " + decimalFormat.format(R1));
            double R2 = (float)((-b-Math.sqrt(delta))/(2*a));
            System.out.println("R2 = " + decimalFormat.format(R2));
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}