/**
 * Números Positivos
 * Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.
 * Entrada
 * Seis valores, negativos e/ou positivos.
 * Saída
 * Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */
package uri1060;

import java.io.IOException;
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

        int contPositivos = 0;
        ArrayList<Double> vetor = new ArrayList<Double>();
        Double valor;
        for(int cont=0 ; cont<6 ; cont++) {
            valor = scanner.nextDouble();
            vetor.add(valor);
        }

        for (Double elementoVetor : vetor) {
            if(elementoVetor>0) {
                contPositivos++;
            }
        }
        System.out.println(contPositivos + " valores positivos");
    }
}