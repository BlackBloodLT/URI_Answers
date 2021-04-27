/**
 * Médias Ponderadas
 * Leia 1 valor inteiro N, que representa o número de casos
 * de teste que vem a seguir. Cada caso de teste consiste
 * de 3 valores reais, cada um deles com uma casa decimal.
 * Apresente a média ponderada para cada um destes conjuntos
 * de 3 valores, sendo que o primeiro valor tem peso 2, o
 * segundo valor tem peso 3 e o terceiro valor tem peso 5.
 * Entrada
 * O arquivo de entrada contém um valor inteiro N na primeira
 * linha. Cada N linha a seguir contém um caso de teste com
 * três valores com uma casa decimal cada valor.
 * Saída
 * Para cada caso de teste, imprima a média ponderada dos 3
 * valores, conforme exemplo abaixo.
 */
package uri1079;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        Double soma = 0.0;

        int quantidadeIteracoes = scanner.nextInt();

        for(int cont=1 ; cont<=quantidadeIteracoes ; cont++) {
            soma = soma + scanner.nextDouble()*2;
            soma = soma + scanner.nextDouble()*3;
            soma = soma + scanner.nextDouble()*5;

            System.out.println (decimalFormat.format(soma/10));
            soma = 0.0;
        }
    }
}