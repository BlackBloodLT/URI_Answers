/**
 * Notação Científica
 * Números em ponto flutuante podem ser bastante extensos
 * para mostrar. Nesses casos, é conveniente usar a notação
 * científica.
 * Você deve escrever um programa que, dado um número em
 * ponto flutuante, mostre este número na notação científica:
 * sempre mostre o sinal da mantissa; sempre mostre 4 casas
 * decimais na mantissa; use o caractere 'E' para separar a
 * mantissa do expoente; sempre mostre o sinal do expoente;
 * e mostre o expoente com pelo menos 2 dígitos.
 * Entrada
 * A entrada é um número em ponto flutuante de dupla precisão
 * X (de acordo com o padrão IEEE 754-2008). Nunca haverá um
 * número com mais de 110 caracteres nem com mais de 6 casas
 * decimais.
 * Saída
 * A saída é o número X em uma única linha na notação científica
 * detalhada acima. Veja os exemplos abaixo.
 */
package uri1958;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        // Não responde a questão, mas é importante saber essa forma
        // DecimalFormat decimalFormat = new DecimalFormat("0.0000E00");
        double valor = scanner.nextDouble();

        System.out.println(String.format((String.valueOf(valor).startsWith("-") ? "" : "+") + "%.4E",valor));
        // Não responde a questão, mas é importante saber essa forma
        // System.out.println(decimalFormat.format(valor));
    }
}