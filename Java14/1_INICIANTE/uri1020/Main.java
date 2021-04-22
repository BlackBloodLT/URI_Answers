/**
 * Idade em Dias
 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
 * Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
 * Entrada
 * O arquivo de entrada contém um valor inteiro.
 * Saída
 * Imprima a saída conforme exemplo fornecido.
 */

package uri1020;

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

        int dias = scanner.nextInt();
        int contador = 0;

        while(dias>364) {
            dias -= 365;
            contador++;
        }
        System.out.println(contador + " ano(s)");
        contador = 0;

        while(dias>29) {
            dias -= 30;
            contador++;
        }
        System.out.println(contador + " mes(es)");
        contador = 0;

        while(dias>0) {
            dias -= 1;
            contador++;
        }
        System.out.println(contador + " dia(s)");
    }
}