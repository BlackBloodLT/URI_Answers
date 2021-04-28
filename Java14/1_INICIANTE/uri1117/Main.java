/**
 * Validação de Nota
 * Faça um programa que leia as notas referentes
 * às duas avaliações de um aluno. Calcule e imprima
 * a média semestral. Faça com que o algoritmo só
 * aceite notas válidas (uma nota válida deve pertencer
 * ao intervalo [0,10]). Cada nota deve ser validada
 * separadamente.
 * Entrada
 * A entrada contém vários valores reais, positivos ou
 * negativos. O programa deve ser encerrado quando forem
 * lidas duas notas válidas.
 * Saída
 * Se uma nota inválida  for lida, deve ser impressa
 * a mensagem "nota invalida".
 * Quando duas notas válidas forem lidas, deve ser
 * impressa a mensagem "media = " seguido do valor
 * do cálculo.
 * O valor deve ser apresentado com duas casas após
 * o ponto decimal.
 */
package uri1117;

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

        double nota1;
        double nota2;
        double media;

        while(true) {
            nota1 = scanner.nextDouble();
            if(nota1>=0 && nota1<=10) {
                break;
            } else {
                System.out.println("nota invalida");
            }
        }

        while(true) {
            nota2 = scanner.nextDouble();
            if(nota2>=0 && nota2<=10) {
                break;
            } else {
                System.out.println("nota invalida");
            }
        }

        media = (nota1+nota2)/2;

        System.out.println("media = " + decimalFormat.format(media));
    }
}