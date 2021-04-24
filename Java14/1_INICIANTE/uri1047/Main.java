/**
 * Tempo de Jogo com Minutos
 * Leia a hora inicial, minuto inicial, hora final
 * e minuto final de um jogo. A seguir calcule a duração
 * do jogo.
 * Obs: O jogo tem duração mínima de um (1) minuto e
 * duração máxima de 24 horas.
 * Entrada
 * Quatro números inteiros representando a hora de
 * início e fim do jogo.
 * Saída
 * Mostre a seguinte mensagem: “O JOGO DUROU XXX
 * HORA(S) E YYY MINUTO(S)” .
 */
package uri1047;

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
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        int momentoInicial = horaInicial*60+minutoInicial;
        int momentoFinal = horaFinal*60+minutoFinal;
        int delta;

        boolean outroDia = false;

        if((horaInicial>horaFinal) || ((horaInicial==horaFinal) && (minutoInicial>=minutoFinal)) ) {
            outroDia = true;
        }

        if(!outroDia) {
            delta = momentoFinal-momentoInicial;
            System.out.print("O JOGO DUROU " + delta/60 + " HORA(S)");
            delta = delta - (delta/60)*60;
            System.out.println(" E " + delta + " MINUTO(S)");
        } else {
            momentoFinal += 1440;
            delta = momentoFinal-momentoInicial;
            System.out.print("O JOGO DUROU " + delta/60 + " HORA(S)");
            delta = delta - (delta/60)*60;
            System.out.println(" E " + delta + " MINUTO(S)");
        }
    }
}