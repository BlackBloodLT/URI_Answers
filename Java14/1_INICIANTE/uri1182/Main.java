/**
 * Coluna na Matriz
 * Neste problema você deve ler um número que indica
 * uma coluna de uma matriz na qual uma operação deve
 * ser realizada, um caractere maiúsculo, indicando
 * a operação que será realizada, e todos os elementos
 * de uma matriz M[12][12]. Em seguida, calcule e
 * mostre a soma ou a média dos elementos que estão na
 * área verde da matriz, conforme for o caso. A imagem
 * abaixo ilustra o caso da entrada do valor 5 para a
 * coluna da matriz, demonstrando os elementos que
 * deverão ser considerados na operação.
 * Entrada
 * A primeira linha de entrada contem um número C (0 ≤ C ≤ 11)
 * indicando a coluna que será considerada para operação.
 * A segunda linha de entrada contém um único caractere Maiúsculo
 * T ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá
 * ser realizada com os elementos da matriz. Seguem os 144 valores d
 * e ponto flutuante que compõem a matriz.
 * Saída
 * Imprima o resultado solicitado (a soma ou média), com 1 casa
 * após o ponto decimal.
 */
package uri1182;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        int colunaEscolhida = scanner.nextInt();

        String operacaoEscolhida = scanner.next().substring(0,1);

        double[][] matriz = new double[12][12];

        for(int linha=0 ; linha<12 ; linha++) {
            for(int coluna=0 ; coluna<12 ; coluna++) {
                matriz[linha][coluna] = scanner.nextDouble();
            }
        }

        double soma = 0;

        for(int linha=0 ; linha<12 ; linha++) {
            soma += matriz[linha][colunaEscolhida];
        }

        switch(operacaoEscolhida) {
            case "S": {
                System.out.println(decimalFormat.format(soma));
                break;
            }
            case "M": {
                System.out.println(decimalFormat.format(soma/12));
                break;
            }
        }
    }
}