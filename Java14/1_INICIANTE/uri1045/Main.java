/**
 * Tipos de Triângulos
 * Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente,
 * de modo que o lado A representa o maior dos 3 lados. A seguir, determine o
 * tipo de triângulo que estes três lados formam, com base nos seguintes casos,
 * sempre escrevendo uma mensagem adequada:
 * se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
 * se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
 * se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
 * se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
 * se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
 * se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
 * Entrada
 * A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) ,
 * B (0 < B) e C (0 < C).
 * Saída
 * Imprima todas as classificações do triângulo especificado na entrada.
 */
package uri1045;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
        double valor1 = scanner.nextDouble();
        double valor2 = scanner.nextDouble();
        double valor3 = scanner.nextDouble();

        ArrayList<Double> vetor = new ArrayList<>();
        vetor.add(valor1);
        vetor.add(valor2);
        vetor.add(valor3);

        Collections.sort(vetor);

        double A = vetor.get(2);
        double B = vetor.get(1);
        double C = vetor.get(0);

        if(A>=B+C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (A == B && A != C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
            if (A == C && A != B) {
                System.out.println("TRIANGULO ISOSCELES");
            }
            if (B == C && B != A) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}