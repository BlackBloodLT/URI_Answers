/**
 * Salário
 * Escreva um programa que leia o número de um funcionário,
 * seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir,
 * mostre o número e o salário do funcionário, com duas casas
 * decimais.
 * Entrada
 * O arquivo de entrada contém 2 números inteiros e 1 número
 * com duas casas decimais, representando o número, quantidade
 * de horas trabalhadas e o valor que o funcionário recebe
 * por hora trabalhada, respectivamente.
 * Saída
 * Imprima o número e o salário do funcionário, conforme exemplo
 * fornecido, com um espaço em branco antes e depois da igualdade.
 * No caso do salário, também deve haver um espaço em branco após o $.
 */

package uri1008;

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

        int numeroFuncionario= scanner.nextInt();
        int quantidadeHora = scanner.nextInt();
        float valorHora = scanner.nextFloat();

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + df.format(quantidadeHora*valorHora));
    }
}