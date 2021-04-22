/**
 * Esfera
 *  Faça um programa que calcule e mostre o volume
 *  de uma esfera sendo fornecido o valor de seu raio
 *  (R). A fórmula para calcular o volume é: (4/3)
 *  * pi * R3. Considere (atribua) para pi o valor
 *  3.14159.
 *  Dica: Ao utilizar a fórmula, procure usar (4/3.0)
 *  ou (4.0/3), pois algumas linguagens (dentre elas
 *  o C++), assumem que o resultado da divisão entre
 *  dois inteiros é outro inteiro.
 *  Entrada
 *  O arquivo de entrada contém um valor de ponto
 *  flutuante (dupla precisão), correspondente ao
 *  raio da esfera.
 *  Saída
 *  A saída deverá ser uma mensagem "VOLUME" conforme
 *  o exemplo fornecido abaixo, com um espaço antes
 *  e um espaço depois da igualdade. O valor deverá
 *  ser apresentado com 3 casas após o ponto.
 */
package uri1011;

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

        double raio = scanner.nextDouble();

        DecimalFormat decimalFormat3 = new DecimalFormat("0.000");
        System.out.println("VOLUME = " + decimalFormat3.format((4.0/3)*(3.14159)*(Math.pow(raio,3))));
    }
}