/**
 * Sequencia IJ 4
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 * Entrada
 * Não há nenhuma entrada neste problema.
 * Saída
 * Imprima a sequencia conforme exemplo abaixo.
 * I=0 J=1
 * I=0 J=2
 * I=0 J=3
 * I=0.2 J=1.2
 * I=0.2 J=2.2
 * I=0.2 J=3.2
 * .....
 * I=2 J=?
 * I=2 J=?
 * I=2 J=?
 */
package uri1098;

import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        DecimalFormat df = new DecimalFormat("0.0");

        double i = 0.0;
        double j = 1.0;

        while(i<=2) {
            for(int cont=1 ; cont<=3 ; cont++) {
                if(df.format(i).endsWith("0")) {
                    // Imprimir apenas o primeiro algarismo
                    System.out.println("I=" + df.format(i).substring(0, 1) + " J=" + df.format(j).substring(0, 1));
                } else {
                    System.out.println("I=" + df.format(i) + " J=" + df.format(j));
                }
                j++;
            }
            //j será adicionado 0.2 e tem que voltar a ter sua parte inteira subtraindo 3
            j -= 3;
            j += 0.2;
            i += 0.2;
        }
    }
}