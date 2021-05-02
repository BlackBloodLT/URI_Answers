/**
 * Área Superior
 * Leia um caractere maiúsculo, que indica uma operação
 * que deve ser realizada e uma matriz M[12][12]. Em
 * seguida, calcule e mostre a soma ou a média considerando
 * somente aqueles elementos que estão na área superior
 * da matriz, conforme ilustrado abaixo (área verde).
 * Entrada
 * A primeira linha de entrada contem um único caractere
 * Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou
 * Média) que deverá ser realizada com os elementos da matriz.
 * Seguem 144 valores com ponto flutuante de dupla precisão
 * que compõem a matriz.
 * Saída
 * Imprima o resultado solicitado (a soma ou média), com
 * 1 casa após o ponto decimal.
 */
package uri1187;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        double soma = 0.0;
        String operacaoEscolhida = scanner.next().substring(0, 1);
//        char operacaoEscolhida = scanner.next().toUpperCase().charAt(0);

        int contElementosSoma = 0;

        double[][] matriz = new double[12][12];

        for (int linha = 0; linha < 12; linha++) {
            for (int coluna = 0; coluna < 12; coluna++) {
                matriz[linha][coluna] = scanner.nextDouble();
            }
        }

        // Calcula a soma dos elementos:
        for (int linha = 0; linha <= 4; linha++) {
            for (int coluna=linha+1 ; coluna<=5 ; coluna++) {
                soma += matriz[linha][coluna];
                contElementosSoma++;
            }
        }

        for (int coluna = 6; coluna<=10; coluna++) {
            for (int linha = 0; linha<11-coluna; linha++) {
                soma += matriz[linha][coluna];
                contElementosSoma++;
            }
        }
        //Fim do cálculo da soma

        switch (operacaoEscolhida) {
            case "S": {
                System.out.println(decimalFormat.format(soma));
//                System.out.println(String.format("%.1f", soma));
                break;
            }
            case "M": {
//                System.out.println(String.format("%.1f", (soma/contElementosSoma)));
                System.out.println(decimalFormat.format(soma/contElementosSoma));
                break;
            }
        }
    }
}