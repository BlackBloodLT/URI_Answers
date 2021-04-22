/**
 * Distância Entre Dois Pontos
 * Leia os quatro valores correspondentes aos eixos
 * x e y de dois pontos quaisquer no plano, p1(x1,y1)
 * e p2(x2,y2) e calcule a distância entre eles,
 * mostrando 4 casas decimais após a vírgula, segundo
 * a fórmula:
 * Entrada
 * O arquivo de entrada contém duas linhas de dados.
 * A primeira linha contém dois valores de ponto
 * flutuante: x1 y1 e a segunda linha contém dois
 * valores de ponto flutuante x2 y2.
 * Saída
 * Calcule e imprima o valor da distância segundo
 * a fórmula fornecida, com 4 casas após o ponto
 * decimal.
 */
package uri1015;

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

        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();

        DecimalFormat decimalFormat = new DecimalFormat("0.0000");

        System.out.println(decimalFormat.format(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))));
    }
}