/**
 * Bazinga!
 * No oitavo episodio da segunda temporada do seriado
 * The Big Bang Theory, The Lizard-Spock Expansion,
 * Sheldon e Raj discutem qual dos dois é o melhor:
 * o filme Saturn 3 ou a série Deep Space 9. A sugestão
 * de Raj para a resolução do impasse é uma disputa
 * de Pedra-Papel-Tesoura. Contudo, Sheldon argumenta
 * que, se as partes envolvidas se conhecem, entre
 * 75% e 80% das disputas de Pedra-Papel-Tesoura terminam
 * empatadas, e então sugere o Pedra-Papel-Tesoura-Lagarto-Spock.
 * As regras do jogo proposto são:
 *     a tesoura corta o papel;
 *     o papel embrulha a pedra;
 *     a pedra esmaga o lagarto;
 *     o lagarto envenena Spock;
 *     Spock destrói a tesoura;
 *     a tesoura decapita o lagarto;
 *     o lagarto come o papel;
 *     o papel contesta Spock;
 *     Spock vaporiza a pedra;
 *     a pedra quebra a tesoura.
 * Embora a situação não se resolva no episódio (ambos
 * escolhem Spock, resultando em um empate), não é difıcil
 * deduzir o que aconteceria se a disputa continuasse.
 * Caso Sheldon vencesse, ele se deleitaria com a vitória,
 * exclamando "Bazinga!"; caso Raj vencesse, ele concluiria
 * que "Raj trapaceou!"; caso o resultado fosse empate,
 * ele exigiria nova partida: "De novo!". Conhecidas as
 * personagens do jogo escolhido por ambos, faça um programa
 * que imprima a provável reação de Sheldon.
 * Entrada
 * A entrada consiste em uma série de casos de teste.
 * A primeira linha contém um inteiro positivo T (T ≤ 100),
 * que representa o número de casos de teste. Cada caso de
 * teste é representado por uma linha da entrada, contendo
 * as escolhas de Sheldon e Raj, respectivamente, separadas
 * por um espaço em branco. As escolha possíveis são as
 * personagens do jogo: pedra, papel, tesoura, lagarto e
 * Spock.
 * Saida
 * Para cada caso de teste deverá ser impressa a mensagem
 * "Caso #t: R", onde t é o número do caso de teste (cuja
 * contagem se inicia no número um) e R é uma das três
 * reações possíveis de Sheldon: "Bazinga!", "Raj trapaceou!",
 * ou "De novo!".
 */
package uri1828;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeCasos = scanner.nextInt();
        String primeiro;
        String segundo;

        for(int cont=1 ; cont<=quantidadeCasos ; cont++) {
            primeiro = scanner.next();
            segundo = scanner.next();

            switch(primeiro) {
                case "pedra": {
                    if(segundo.equals("pedra")){
                        System.out.println("Caso #" + cont + ": De novo!");
                    } else if(segundo.equals("papel") || segundo.equals("Spock")) {
                        System.out.println("Caso #" + cont + ": Raj trapaceou!");
                    } else if(segundo.equals("tesoura") || segundo.equals("lagarto")) {
                        System.out.println("Caso #" + cont + ": Bazinga!");
                    }
                    break;
                }
                case "papel": {
                    if(segundo.equals("pedra") || segundo.equals("Spock")){
                        System.out.println("Caso #" + cont + ": Bazinga!");
                    } else if(segundo.equals("papel")) {
                        System.out.println("Caso #" + cont + ": De novo!");
                    } else if(segundo.equals("tesoura") || segundo.equals("lagarto")) {
                        System.out.println("Caso #" + cont + ": Raj trapaceou!");
                    }
                    break;
                }
                case "tesoura": {
                    if(segundo.equals("pedra") || segundo.equals("Spock")){
                        System.out.println("Caso #" + cont + ": Raj trapaceou!");
                    } else if(segundo.equals("papel") || segundo.equals("lagarto")) {
                        System.out.println("Caso #" + cont + ": Bazinga!");
                    } else if(segundo.equals("tesoura")) {
                        System.out.println("Caso #" + cont + ": De novo!");
                    }
                    break;
                }
                case "lagarto": {
                    if(segundo.equals("pedra") || segundo.equals("tesoura")){
                        System.out.println("Caso #" + cont + ": Raj trapaceou!");
                    } else if(segundo.equals("papel") || segundo.equals("Spock")) {
                        System.out.println("Caso #" + cont + ": Bazinga!");
                    } else if(segundo.equals("lagarto")) {
                        System.out.println("Caso #" + cont + ": De novo!");
                    }
                    break;
                }
                case "Spock": {
                    if(segundo.equals("pedra") || segundo.equals("tesoura")){
                        System.out.println("Caso #" + cont + ": Bazinga!");
                    } else if(segundo.equals("papel") || segundo.equals("lagarto")) {
                        System.out.println("Caso #" + cont + ": Raj trapaceou!");
                    } else if(segundo.equals("Spock")) {
                        System.out.println("Caso #" + cont + ": De novo!");
                    }
                    break;
                }
            }
        }
    }
}