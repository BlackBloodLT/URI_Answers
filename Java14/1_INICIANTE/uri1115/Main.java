/**
 * Quadrante
 * Escreva um programa para ler as coordenadas (X,Y) de
 * uma quantidade indeterminada de pontos no sistema
 * cartesiano. Para cada ponto escrever o quadrante a
 * que ele pertence. O algoritmo será encerrado quando
 * pelo menos uma de duas coordenadas for NULA (nesta
 * situação sem escrever mensagem alguma).
 * Entrada
 * A entrada contém vários casos de teste. Cada caso de
 * teste contém 2 valores inteiros.
 * Saída
 * Para cada caso de teste mostre em qual quadrante do
 * sistema cartesiano se encontra a coordenada lida,
 * conforme o exemplo.
 */
package uri1115;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(x>0 && y>0) {
                System.out.println("primeiro");
            } else if(x<0 && y>0) {
                System.out.println("segundo");
            } else if(x<0 && y<0) {
                System.out.println("terceiro");
            } else if(x>0 && y<0) {
                System.out.println("quarto");
            } else if(x==0 || y==0) {
                break;
            }
        }
    }
}