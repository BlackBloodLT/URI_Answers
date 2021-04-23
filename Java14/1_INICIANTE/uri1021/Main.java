/**
 * Notas e Moedas
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
 * Entrada
 * O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
 * Saída
 * Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
 * Obs: Utilize ponto (.) para separar a parte decimal.
 */
package uri1021;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scanner = new Scanner(System.in);
        long valor = (long)(scanner.nextDouble()*100);

        System.out.println("NOTAS:");
        System.out.println(valor/10000 + " nota(s) de R$ 100.00");

        valor = valor - (valor/10000)*10000;
        System.out.println(valor/5000 + " nota(s) de R$ 50.00");

        valor = valor - (valor/5000)*5000;
        System.out.println(valor/2000 + " nota(s) de R$ 20.00");

        valor = valor - (valor/2000)*2000;
        System.out.println(valor/1000 + " nota(s) de R$ 10.00");

        valor = valor - (valor/1000)*1000;
        System.out.println(valor/500 + " nota(s) de R$ 5.00");

        valor = valor - (valor/500)*500;
        System.out.println(valor/200 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");

        valor = valor - (valor/200)*200;
        System.out.println(valor/100 + " moeda(s) de R$ 1.00");

        valor = valor - (valor/100)*100;
        System.out.println(valor/50 + " moeda(s) de R$ 0.50");

        valor = valor - (valor/50)*50;
        System.out.println(valor/25 + " moeda(s) de R$ 0.25");

        valor = valor - (valor/25)*25;
        System.out.println(valor/10 + " moeda(s) de R$ 0.10");

        valor = valor - (valor/10)*10;
        System.out.println(valor/5 + " moeda(s) de R$ 0.05");

        valor = valor - (valor/5)*5;
        System.out.println(valor + " moeda(s) de R$ 0.01");

//        int contador = 0;
//
//        System.out.println("NOTAS:");
//
//        while(valor>99.99) {
//            valor -= 100;
//            contador++;
//        }
//        System.out.println(contador + " nota(s) de R$ 100.00");
//        contador = 0;
//
//        while(valor>49.99) {
//            valor -= 50;
//            contador++;
//        }
//        System.out.println(contador + " nota(s) de R$ 50.00");
//        contador = 0;
//
//        while(valor>19.99) {
//            valor -= 20;
//            contador++;
//        }
//        System.out.println(contador + " nota(s) de R$ 20.00");
//        contador = 0;
//
//        while(valor>9.99) {
//            valor -= 10;
//            contador++;
//        }
//        System.out.println(contador + " nota(s) de R$ 10.00");
//        contador = 0;
//
//        while(valor>4.99) {
//            valor -= 5;
//            contador++;
//        }
//        System.out.println(contador + " nota(s) de R$ 5.00");
//        contador = 0;
//
//        while(valor>1.99) {
//            valor -= 2;
//            contador++;
//        }
//        System.out.println(contador + " nota(s) de R$ 2.00");
//        contador = 0;
//
//        System.out.println("MOEDAS:");
//
//        while(valor>0.99) {
//            valor -= 1;
//            contador++;
//        }
//        System.out.println(contador + " moeda(s) de R$ 1.00");
//        contador = 0;
//
//        while(valor>0.49) {
//            valor -= 0.5;
//            contador++;
//        }
//        System.out.println(contador + " moeda(s) de R$ 0.50");
//        contador = 0;
//
//        while(valor>0.24) {
//            valor -= 0.25;
//            contador++;
//        }
//        System.out.println(contador + " moeda(s) de R$ 0.25");
//        contador = 0;
//
//        while(valor>0.09) {
//            valor -= 0.10;
//            contador++;
//        }
//        System.out.println(contador + " moeda(s) de R$ 0.10");
//        contador = 0;
//
//        while(valor>0.04) {
//            valor -= 0.05;
//            contador++;
//        }
//        System.out.println(contador + " moeda(s) de R$ 0.05");
//        contador = 0;
//
//        while(valor>0.009) {
//            valor -= 0.01;
//            contador++;
//        }
//        System.out.println(contador + " moeda(s) de R$ 0.01");
    }
}