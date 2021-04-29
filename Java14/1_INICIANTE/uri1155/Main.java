/**
 * Sequência S
 * Escreva um algoritmo para calcular e escrever o
 * valor de S, sendo S dado pela fórmula:
 * S = 1 + 1/2 + 1/3 + … + 1/100
 * Entrada
 * Não há nenhuma entrada neste problema.
 * Saída
 * A saída contém um valor correspondente ao valor
 * de S.
 * O valor deve ser impresso com dois dígitos após
 * o ponto decimal.
 */
package uri1155;

import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double soma = 0.0;

        for(int cont=1 ; cont<=100 ; cont++) {
            soma += (1)/((double)cont);
        }

        System.out.println(decimalFormat.format(soma));
    }
}