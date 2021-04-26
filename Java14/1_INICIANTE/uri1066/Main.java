/**
 * Pares, Ímpares, Positivos e NegativosPares, Ímpares,
 * Positivos e Negativos
 * Leia 5 valores Inteiros. A seguir mostre quantos
 * valores digitados foram pares, quantos valores digitados
 * foram ímpares, quantos valores digitados foram positivos
 * e quantos valores digitados foram negativos.
 * Entrada
 * O arquivo de entrada contém 5 valores inteiros quaisquer.
 * Saída
 * Imprima a mensagem conforme o exemplo fornecido, uma mensagem
 * por linha, não esquecendo o final de linha após cada uma.
 */

package uri1066;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);

        int contadorPares = 0;
        int contadorImpares = 0;
        int contadoresPositivos = 0;
        int contadoresNegativos = 0;

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        for(int cont= 0; cont<5 ; cont++) {
            vetor.add(scanner.nextInt());
        }

        for(int elemento : vetor) {

            if(elemento%2==0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }

            if(elemento>0) {
                contadoresPositivos++;
            } else if(elemento<0){
                contadoresNegativos++;
            }
        }

        System.out.println(contadorPares + " valor(es) par(es)");
        System.out.println(contadorImpares + " valor(es) impar(es)");
        System.out.println(contadoresPositivos + " valor(es) positivo(s)");
        System.out.println(contadoresNegativos + " valor(es) negativo(s)");
    }
}