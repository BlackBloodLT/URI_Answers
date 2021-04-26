/**
 * A execução desse programa é muito demorada!!!
 * Não é a melhor forma de resolver o caso!!!
 */
package uri1061;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scanner = new Scanner(System.in);

        String[] diaI = scanner.nextLine().split(" ");
        String[] horarioI = scanner.nextLine().replaceAll(" ","").split(":");
        int diaInicial = Integer.parseInt(diaI[1]);
        int horaInicial = Integer.parseInt(horarioI[0]);
        int minutoInicial = Integer.parseInt(horarioI[1]);
        int segundoInicial = Integer.parseInt(horarioI[2]);

        String[] diaF = scanner.nextLine().split(" ");
        String[] horarioF = scanner.nextLine().replaceAll(" ","").split(":");
        int diaFinal = Integer.parseInt(diaF[1]);
        int horaFinal = Integer.parseInt(horarioF[0]);
        int minutoFinal = Integer.parseInt(horarioF[1]);
        int segundoFinal = Integer.parseInt(horarioF[2]);

        Calendar dataInicial = Calendar.getInstance();
        dataInicial.set(Calendar.DAY_OF_MONTH,diaInicial);
        dataInicial.set(Calendar.HOUR_OF_DAY,horaInicial);
        dataInicial.set(Calendar.MINUTE,minutoInicial);
        dataInicial.set(Calendar.SECOND,segundoInicial);

        Calendar dataFinal = Calendar.getInstance();
        dataFinal.set(Calendar.DAY_OF_MONTH,diaFinal);
        dataFinal.set(Calendar.HOUR_OF_DAY,horaFinal);
        dataFinal.set(Calendar.MINUTE,minutoFinal);
        dataFinal.set(Calendar.SECOND,segundoFinal);

        int diferencaDias = 0;
        int diferencaHoras = 0;
        int diferencaMinutos = 0;
        int diferencaSegundos = 0;

        while(dataFinal!=dataInicial) {
            dataInicial.set(Calendar.SECOND,dataInicial.get(Calendar.SECOND)+1);
            diferencaSegundos++;
            if(diferencaSegundos>=60) {
                diferencaMinutos++;
            }
            if(diferencaMinutos>=60) {
                diferencaHoras++;
            }
            if(diferencaHoras>=24) {
                diferencaDias++;
            }
        }

        System.out.println(diferencaDias + " dia(s)");
        System.out.println(diferencaHoras + " hora(s)");
        System.out.println(diferencaMinutos + " minuto(s)");
        System.out.println(diferencaSegundos + " segundo(s)");
    }
}