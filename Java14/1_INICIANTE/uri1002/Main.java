/**
 * Área do Círculo
 * A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
 * - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
 * Entrada
 * A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
 * Saída
 *  Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */
package uri1002;

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
        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double area = raio*raio*pi;
        System.out.printf("A=%.4f%n", area);
    }
}