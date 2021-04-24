/**
 * Tempo de Jogo
 * Leia a hora inicial e a hora final de um jogo. A
 * seguir calcule a duração do jogo, sabendo que o
 * mesmo pode começar em um dia e terminar em outro,
 * tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * Entrada
 * A entrada contém dois valores inteiros representando
 * a hora de início e a hora de fim do jogo.
 * Saída
 * Apresente a duração do jogo conforme exemplo abaixo.
 */
package uri1046;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        if(horaInicial<horaFinal) {
            System.out.println("O JOGO DUROU " + (horaFinal-horaInicial) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + (horaFinal-horaInicial+24) + " HORA(S)");
        }
    }
}