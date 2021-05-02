/**
 * Preenchimento de Vetor IV
 * Neste problema você deverá ler 15 valores colocá-los
 * em 2 vetores conforme estes valores forem pares ou ímpares.
 * Só que o tamanho de cada um dos dois vetores é de 5 posições.
 * Então, cada vez que um dos dois vetores encher, você
 * deverá imprimir t odo o vetor e utilizá-lo novamente para
 * os próximos números que forem lidos. Terminada a leitura,
 * deve-se imprimir o conteúdo que restou em cada um dos dois
 * vetores, imprimindo primeiro os valores do vetor impar.
 * Cada vetor pode ser preenchido tantas vezes quantas for necessário.
 * Entrada
 * A entrada contém 15 números inteiros.
 * Saída
 * Imprima a saída conforme o exemplo abaixo.
 */
package uri1179;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];

        int contPar = 0;
        int contImpar = 0;

        for(int cont=1 ; cont<=15 ; cont++) {
            int valor = scanner.nextInt();

            if(valor%2==0) {
                if(contPar<=4) {
                    vetorPar[contPar] = valor;
                    contPar++;
                } else {
                    for(int i=0 ; i<=4 ; i++) {
                        System.out.println("par[" + i + "] = " + vetorPar[i]);
                    }
                    vetorPar[0] = valor;
                    contPar = 1;
                }
            } else {
                if(contImpar<=4) {
                    vetorImpar[contImpar] = valor;
                    contImpar++;
                } else {
                    for(int i=0 ; i<=4 ; i++) {
                        System.out.println("impar[" + i + "] = " + vetorImpar[i]);
                    }
                    vetorImpar[0] = valor;
                    contImpar = 1;
                }
            }

            if(cont==15) {
                for(int i=0 ; i<=contImpar-1 ; i++) {
                    System.out.println("impar[" + i + "] = " + vetorImpar[i]);
                }
                for(int i=0 ; i<=contPar-1 ; i++) {
                    System.out.println("par[" + i + "] = " + vetorPar[i]);
                }
            }
        }
    }
}