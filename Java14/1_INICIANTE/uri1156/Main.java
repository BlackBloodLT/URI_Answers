/**
 * Sequência S II
 * Escreva um algoritmo para calcular e escrever o valor de S,
 * sendo S dado pela fórmula:
 * S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
 * Entrada
 * Não há nenhuma entrada neste problema.
 * Saída
 * A saída contém um valor correspondente ao valor de S.
 * O valor deve ser impresso com dois dígitos após o ponto decimal.
 */
package uri1156;

import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        DecimalFormat df = new DecimalFormat("0.00");

        int num = 1;
        int expDenominador = 0;
        double soma = 0;


        while(num<=39) {

            soma += ((double)num)/(Math.pow(2,expDenominador));
            num += 2;
            expDenominador++;
        }

        System.out.println(df.format(soma));
    }
}