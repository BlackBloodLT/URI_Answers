/**
 * Grenais
 * A Federação Gaúcha de Futebol contratou você para
 * escrever um programa para fazer uma estatística do
 * resultado de vários GRENAIS. Escreva um programa
 * para ler o número de gols marcados pelo Inter e pelo
 * Grêmio em um GRENAL. Logo após escrever a mensagem
 * "Novo grenal (1-sim 2-nao)" e solicitar uma resposta.
 * Se a resposta for 1, o algoritmo deve ser executado
 * novamente solicitando o número de gols marcados pelos
 * times em uma nova partida, caso contrário deve ser
 * encerrado imprimindo:
 * - Quantos GRENAIS fizeram parte da estatística.
 * - O número de vitórias do Inter.
 * - O número de vitórias do Grêmio.
 * - O número de Empates.
 * - Uma mensagem indicando qual o time que venceu o maior
 * número de GRENAIS (ou "Nao houve vencedor", caso termine
 * empatado).
 * Entrada
 * O arquivo de entrada contém 2 valores inteiros, correspondentes
 * aos gols marcados pelo Inter e pelo Grêmio respectivamente.
 * Em seguida háverá um inteiro (1 ou 2), correspondente à repetição
 * do programa.
 * Saída
 * Após cada leitura dos gols, deve ser impressa a mensagem
 * "Novo grenal (1-sim 2-nao)". Quando o algoritmo for encerrado
 * devem ser mostradas as estatísticas conforme a descrição apresentada
 * acima. Obs: a palavra "Gremio" deve ser impressa sem acento,
 * conforme o exemplo abaixo.
 */
package uri1131;

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

        int golsInter;
        int golsGremio;

        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        int numeroJogos = 0;

        int opcao=1;

        while(opcao==1) {
            golsInter = scanner.nextInt();
            golsGremio = scanner.nextInt();

            numeroJogos++;

            if(golsInter>golsGremio) {
                vitoriasInter++;
            } else if(golsInter<golsGremio) {
                vitoriasGremio++;
            } else {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = scanner.nextInt();

            if(opcao==2) {
                break;
            }
        }

        System.out.println(numeroJogos + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);

        if(vitoriasInter>vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if(vitoriasInter<vitoriasGremio) {
            System.out.println("Gremio venceu mais");
        }

    }
}