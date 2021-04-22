/**
 * Consumo
 * Calcule o consumo médio de um automóvel sendo
 * fornecidos a distância total percorrida (em Km)
 * e o total de combustível gasto (em litros).
 * Entrada
 * O arquivo de entrada contém dois valores: um
 * valor inteiro X representando a distância total
 * percorrida (em Km), e um valor real Y representando
 * o total de combustível gasto, com um dígito após
 * o ponto decimal.
 * Saída
 * Apresente o valor que representa o consumo médio
 * do automóvel com 3 casas após a vírgula, seguido
 * da mensagem "km/l".
 */
package uri1014;

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

        int X = scanner.nextInt();
        double Y = scanner.nextDouble();

        DecimalFormat decimalFormat = new DecimalFormat("0.000");

        System.out.println(decimalFormat.format(X/Y) + " km/l");

    }
}