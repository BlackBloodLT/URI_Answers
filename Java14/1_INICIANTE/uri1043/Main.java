/**
 * Triângulo
 * Leia 3 valores reais (A, B e C) e verifique se eles formam
 * ou não um triângulo. Em caso positivo, calcule o perímetro
 * do triângulo e apresente a mensagem:
 * Perimetro = XX.X
 * Em caso negativo, calcule a área do trapézio que tem A e B
 * como base e C como altura, mostrando a mensagem
 * Area = XX.X
 * Entrada
 * A entrada contém três valores reais.
 * Saída
 * O resultado deve ser apresentado com uma casa decimal.
 */

package uri1043;

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

        double somaab = a+b;
        double somabc = b+c;
        double somaac = a+c;

        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        boolean triangulo = false;
        if(somaab>c && somabc>a && somaac>b) {
            System.out.println("Perimetro = " + decimalFormat.format(a+b+c));
        } else {
            System.out.println("Area = " + decimalFormat.format((a+b)*(c/2)));
        }
    }
}