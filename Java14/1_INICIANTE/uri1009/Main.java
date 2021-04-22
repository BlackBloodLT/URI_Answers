/**
 * Salário com Bônus
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
 * Entrada
 * O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.
 * Saída
 * Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

package uri1009;

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

        String nome = scanner.next();
        float salarioFixo = scanner.nextFloat();
        float totalVendasEfetuadas = scanner.nextFloat();

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("TOTAL = R$ " + df.format(salarioFixo+totalVendasEfetuadas*0.15));
    }
}