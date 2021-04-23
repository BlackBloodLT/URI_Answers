/**
 * Coordenadas de um Ponto
 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
 * Entrada
 * A entrada contem as coordenadas de um ponto.
 * Saída
 * A saída deve apresentar o quadrante em que o ponto se encontra.
 */
package uri1041;

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

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x==0.0 && y==0.0) {
            System.out.println("Origem");
        } else if(x>0.0 && y>0.0) {
            System.out.println("Q1");
        } else if(x<0.0 && y>0.0) {
            System.out.println("Q2");
        } else if(x<0.0 && y<0.0) {
            System.out.println("Q3");
        } else if(x>0.0 && y<0.0) {
            System.out.println("Q4");
        } else if(x==0.0 && y!=0.0) {
            System.out.println("Eixo Y");
        } else if(x!=0.0 && y==0.0) {
            System.out.println("Eixo X");
        }
    }
}