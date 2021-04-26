/**
 * Positivos e Média
 * Leia 6 valores. Em seguida, mostre quantos destes
 * valores digitados foram positivos. Na próxima linha,
 * deve-se mostrar a média de todos os valores positivos
 * digitados, com um dígito após o ponto decimal.
 * Entrada
 * A entrada contém 6 números que podem ser valores inteiros
 * ou de ponto flutuante. Pelo menos um destes números
 * será positivo.
 * Saída
 * O primeiro valor de saída é a quantidade de valores positivos.
 * A próxima linha deve mostrar a média dos valores positivos
 * digitados.
 */
package uri1064;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
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

        ArrayList<Double> vetorEntradas = new ArrayList<Double>();

        double soma = 0.0;
        int contadorPositivo = 0;

        for(int cont=0 ; cont<6 ; cont++) {
            vetorEntradas.add(scanner.nextDouble());
        }

        for(double elemento : vetorEntradas) {
            if(elemento>0) {
                soma += elemento;
                contadorPositivo++;
            }
        }

        System.out.println(contadorPositivo + " valores positivos");
        System.out.println(decimalFormat.format(soma/contadorPositivo));
    }
}