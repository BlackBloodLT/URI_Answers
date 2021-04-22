/**
 * Área
 * Escreva um programa que leia três valores com ponto flutuante de
 * dupla precisão: A, B e C. Em seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 * Entrada
 * O arquivo de entrada contém três valores com um dígito após o
 * ponto decimal.
 * Saída
 * O arquivo de saída deverá conter 5 linhas de dados. Cada linha
 * corresponde a uma das áreas descritas acima, sempre com mensagem
 * correspondente e um espaço entre os dois pontos e o valor.
 * O valor calculado deve ser apresentado com 3 dígitos após o ponto
 * decimal.
 */

package uri1012;

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

        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        DecimalFormat decimalFormat = new DecimalFormat("0.000");

        System.out.println("TRIANGULO: " + decimalFormat.format((A*C)/2));
        System.out.println("CIRCULO: " + decimalFormat.format(3.14159*C*C));
        System.out.println("TRAPEZIO: " + decimalFormat.format((A+B)*(C/2)));
        System.out.println("QUADRADO: " + decimalFormat.format(Math.pow(B,2)));
        System.out.println("RETANGULO: " + decimalFormat.format(A*B));
    }
}