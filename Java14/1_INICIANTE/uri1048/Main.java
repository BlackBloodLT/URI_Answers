/**
 * Aumento de Salário
 * A empresa ABC resolveu conceder um aumento de
 * salários a seus funcionários de acordo com a
 * tabela abaixo:
 * Leia o salário do funcionário e calcule e mostre
 * o novo salário, bem como o valor de reajuste
 * ganho e o índice reajustado, em percentual.
 * Entrada
 * A entrada contém apenas um valor de ponto flutuante,
 * com duas casas decimais.
 * Saída
 * Imprima 3 linhas na saída: o novo salário, o valor
 * ganho de reajuste e o percentual de reajuste ganho,
 * conforme exemplo abaixo.
 */
package uri1048;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        double adicional;
        double novoSalario;
        int correcao;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        if(salario>0 && salario<=400) {
            adicional = salario*0.15;
            correcao = 15;
        } else if(salario>400 && salario<=800) {
            adicional = salario*0.12;
            correcao = 12;
        } else if(salario>800 && salario<=1200) {
            adicional = salario*0.10;
            correcao = 10;
        } else if(salario>1200 && salario<=2000) {
            adicional = salario*0.07;
            correcao = 7;
        } else {
            adicional = salario*0.04;
            correcao = 4;
        }

        novoSalario = salario + adicional;
        System.out.println("Novo salario: " + decimalFormat.format(novoSalario));
        System.out.println("Reajuste ganho: " + decimalFormat.format(adicional));
        System.out.println("Em percentual: " + correcao + " %");
    }
}