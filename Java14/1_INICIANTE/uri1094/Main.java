package uri1094;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int numeroTestes = scanner.nextInt();

        int numeroCobaias = 0;
        int numeroCoelhos = 0;
        int numeroRatos = 0;
        int numeroSapos = 0;

        for(int cont=0 ; cont<numeroTestes ; cont++) {
            int numeroCobaiasAtual = scanner.nextInt();
            char tipoCobaiaAtual = scanner.next().charAt(0);

            numeroCobaias += numeroCobaiasAtual;

            switch(tipoCobaiaAtual) {
                case 'C':
                    numeroCoelhos += numeroCobaiasAtual;
                    break;
                case 'R':
                    numeroRatos += numeroCobaiasAtual;
                    break;
                case 'S':
                    numeroSapos += numeroCobaiasAtual;
                    break;
            }
        }

        System.out.println("Total: " + numeroCobaias + " cobaias");
        System.out.println("Total de coelhos: " + numeroCoelhos);
        System.out.println("Total de ratos: " + numeroRatos);
        System.out.println("Total de sapos: " + numeroSapos);
        System.out.println("Percentual de coelhos: " + decimalFormat.format((double)numeroCoelhos/numeroCobaias*100) + " %");
        System.out.println("Percentual de ratos: " + decimalFormat.format((double)numeroRatos/numeroCobaias*100) + " %");
        System.out.println("Percentual de sapos: " + decimalFormat.format((double)numeroSapos/numeroCobaias*100) + " %");
    }
}