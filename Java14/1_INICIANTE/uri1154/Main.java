/**
 * Idades
 * Faça um algoritmo para ler um número indeterminado de
 * dados, contendo cada um, a idade de um indivíduo. O
 * último dado, que não entrará nos cálculos, contém o
 * valor de idade negativa. Calcular e imprimir a idade
 * média deste grupo de indivíduos.
 * Entrada
 * A entrada contém um número indeterminado de inteiros.
 * A entrada será encerrada quando um valor negativo for
 * lido.
 * Saída
 * A saída contém um valor correspondente à média de idade
 * dos indivíduos.
 * A média deve ser impressa com dois dígitos após o ponto
 * decimal.
 */
package uri1154;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int soma = 0;
        int quantidadeNumeros = 0;

        while(true) {
            int entrada = scanner.nextInt();

            if(entrada<0) {
                break;
            }

            soma += entrada;
            quantidadeNumeros++;
        }

        System.out.println(decimalFormat.format((double)soma/quantidadeNumeros));
    }
}