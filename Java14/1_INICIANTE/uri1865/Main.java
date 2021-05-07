/**
 * Mjölnir
 * Odin criou para Thor a mais fiel e poderosa arma possível,
 * o martelo Mjölnir. Feito de um minério místico especial
 * chamado Uru e forjado no coração de uma estrela pelos
 * Deuses ferreiros de Asgard, Brokk e Eitri, os lendários
 * ferreiros.
 * Um dia, Thor desafiou seus amigos para ver quem conseguia
 * levantar o Mjölnir.
 * Escreva um programa que, dado um nome, e a força, em
 * Newtons, aplicado ao tentar levantar o Mjölnir, informar
 * se a pessoa conseguiu ou não levantá-lo.
 * Entrada
 * Um número inteiro C será informado, que será a quantidade
 * de casos de teste. Cada caso de teste inicia com uma
 * palavra, que é o primeiro nome de quem está tentando
 * levantar o Mjölnir, e um inteiro N (1 ≤ N ≤ 25000),
 * indicando a força aplicada para cima, em Newtons, ao puxar
 * o martelo, de modo a tentar levantá-lo.
 * Saída
 * Para cada caso de teste imprima um caractere ‘Y’, caso a
 * pessoa tenha conseguido levantar , ou ‘N’, caso não tenha
 * conseguido.
 */
package uri1865;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int quantidadeCasos = scanner.nextInt();
        int poder;

        for(int cont=1 ; cont<=quantidadeCasos ; cont++) {
            nome = scanner.next();
            poder = scanner.nextInt();
            if(!nome.equals("Thor")) {
                System.out.println("N");
            } else {
                System.out.println("Y");
            }
        }
    }
}