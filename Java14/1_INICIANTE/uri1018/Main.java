/**
 * Cédulas
 * Leia um valor inteiro. A seguir, calcule o menor
 * número de notas possíveis (cédulas) no qual o valor
 * pode ser decomposto. As notas consideradas são de 100,
 * 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e
 * a relação de notas necessárias.
 * Entrada
 * O arquivo de entrada contém um valor inteiro N
 * (0 < N < 1000000).
 * Saída
 * Imprima o valor lido e, em seguida, a quantidade mínima
 * de notas de cada tipo necessárias, conforme o exemplo
 * fornecido. Não esqueça de imprimir o fim de linha após cada linha,
 * caso contrário seu programa apresentará a mensagem:
 * “Presentation Error”.
 */

package uri1018;

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

        long valor = scanner.nextLong();

        int contador = 0;

        System.out.println(valor);
        while(valor>99) {
            valor -= 100;
            contador++;
        }
        System.out.println(contador + " nota(s) de R$ 100,00");
        contador = 0;

        while(valor>49) {
            valor -= 50;
            contador++;
        }
        System.out.println(contador + " nota(s) de R$ 50,00");
        contador = 0;

        while(valor>19) {
            valor -= 20;
            contador++;
        }
        System.out.println(contador + " nota(s) de R$ 20,00");
        contador = 0;

        while(valor>9) {
            valor -= 10;
            contador++;
        }
        System.out.println(contador + " nota(s) de R$ 10,00");
        contador = 0;

        while(valor>4) {
            valor -= 5;
            contador++;
        }
        System.out.println(contador + " nota(s) de R$ 5,00");
        contador = 0;

        while(valor>1) {
            valor -= 2;
            contador++;
        }
        System.out.println(contador + " nota(s) de R$ 2,00");
        contador = 0;

        while(valor>0) {
            valor -= 1;
            contador++;
        }
        System.out.println(contador + " nota(s) de R$ 1,00");
    }
}