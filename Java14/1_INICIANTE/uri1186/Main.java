/**
 * Abaixo da Diagonal Secundária
 * Leia um caractere maiúsculo, que indica uma
 * operação que deve ser realizada e uma matriz
 * M[12][12]. Em seguida, calcule e mostre a soma
 * ou a média considerando somente aqueles
 * elementos que estão abaixo da diagonal Secundária
 * da matriz, conforme ilustrado abaixo (área verde).
 * Entrada
 * A primeira linha de entrada contem um único caractere
 * Maiúsculo O ('S' ou 'M'), indicando a operação (Soma
 * ou Média) que deverá ser realizada com os elementos
 * da matriz. Seguem os 144 valores de ponto flutuante
 * que compõem a matriz.
 * Saída
 * Imprima o resultado solicitado (a soma ou média),
 * com 1 casa após o ponto decimal.
 */
package uri1186;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        double soma = 0;
        String operacaoEscolhida = scanner.next().substring(0, 1);

        int contElementosSoma = 0;

        double[][] matriz = new double[12][12];

        for (int linha = 0; linha < 12; linha++) {
            for (int coluna = 0; coluna < 12; coluna++) {
                matriz[linha][coluna] = scanner.nextDouble();
            }
        }

        for (int linha = 1; linha <= 11; linha++) {
            for (int coluna = 11; coluna>11-linha; coluna--) {
                soma += matriz[linha][coluna];
                contElementosSoma++;
            }
        }

        switch (operacaoEscolhida) {
            case "S": {
                System.out.println(decimalFormat.format(soma));
                break;
            }
            case "M": {
                System.out.println(decimalFormat.format(soma / contElementosSoma));
                break;
            }
        }
    }
}