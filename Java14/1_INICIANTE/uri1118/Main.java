/**
 * Várias Notas Com Validação
 * Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. Calcule e imprima a média semestral. O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
 * No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.
 * Entrada
 * O arquivo de entrada contém vários valores reais, positivos ou negativos. Quando forem lidas duas notas válidas, deve ser lido um valor inteiro X . O programa deve parar quando o valor lido para este X for igual a 2.
 * Saída
 * Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.
 * Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem deve ser apresentada novamente se o valor da entrada padrão para X for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.
 * A média deve ser impressa com dois dígitos após o ponto decimal.
 */
package uri1118;

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

        int opcao=1;

        while(true) {

            while (true) {
                nota1 = scanner.nextDouble();
                if (nota1 >= 0 && nota1 <= 10) {
                    break;
                } else {
                    System.out.println("nota invalida");
                }
            }

            while (true) {
                nota2 = scanner.nextDouble();
                if (nota2 >= 0 && nota2 <= 10) {
                    break;
                } else {
                    System.out.println("nota invalida");
                }
            }

            media = (nota1 + nota2) / 2;

            System.out.println("media = " + decimalFormat.format(media));

            opcao = 0;

            while(opcao!=1 && opcao!=2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = scanner.nextInt();
            }

            if(opcao==2) {
                break;
            }
        }
    }
}