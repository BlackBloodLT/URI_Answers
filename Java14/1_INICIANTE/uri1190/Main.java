package uri1190;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        double soma = 0.0;
        String operacaoEscolhida = scanner.next().substring(0, 1);
//        char operacaoEscolhida = scanner.next().toUpperCase().charAt(0);
//        String operacaoEscolhida = "S"; // Para testes

        int contElementosSoma = 0;

        double[][] matriz = new double[12][12];

        for (int linha = 0; linha < 12; linha++) {
            for (int coluna = 0; coluna < 12; coluna++) {
                matriz[linha][coluna] = scanner.nextDouble();
//                matriz[linha][coluna] = 1; // Para testes
            }
        }

        // Calcula a soma dos elementos:
        for (int linha = 1; linha < 11; linha++) {
            for (int coluna=0 ; coluna<matriz[linha].length ; coluna++) {
                if ((coluna>linha) && (coluna>12-linha-1)) {
                    soma += matriz[linha][coluna];
                    contElementosSoma++;
                }
            }
        }
        //Fim do cálculo da soma

        switch (operacaoEscolhida) {
            case "S": {
                System.out.println(decimalFormat.format(soma));
//                System.out.println(String.format("%.1f", soma));
                break;
            }
            case "M": {
//                System.out.println(String.format("%.1f", (soma/contElementosSoma)));
                System.out.println(decimalFormat.format(soma/contElementosSoma));
                break;
            }
        }
    }
}