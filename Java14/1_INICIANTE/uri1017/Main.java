/**
 * Gasto de Combustível
 * Joaozinho quer calcular e mostrar a quantidade de
 * litros de combustível gastos em uma viagem, ao utilizar
 * um automóvel que faz 12 KM/L. Para isso, ele gostaria
 * que você o auxiliasse através de um simples programa.
 * Para efetuar o cálculo, deve-se fornecer o tempo gasto
 * na viagem (em horas) e a velocidade média durante a mesma
 * (em km/h). Assim, pode-se obter distância percorrida e,
 * em seguida, calcular quantos litros seriam necessários.
 * Mostre o valor com 3 casas decimais após o ponto.
 * Entrada
 * O arquivo de entrada contém dois inteiros. O primeiro
 * é o tempo gasto na viagem (em horas) e o segundo é a
 * velocidade média durante a mesma (em km/h).
 * Saída
 * Imprima a quantidade de litros necessária para realizar a
 * viagem, com três dígitos após o ponto decimal
 */
package uri1017;

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

        int tempoGastoHoras = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();

        DecimalFormat decimalFormat = new DecimalFormat("0.000");

        System.out.println(decimalFormat.format((tempoGastoHoras*velocidadeMedia)/12.0));

    }
}