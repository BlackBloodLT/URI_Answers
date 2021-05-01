/**
 * Divisores I
 * Ler um número inteiro N e calcular todos os seus divisores.
 * Entrada
 * O arquivo de entrada contém um valor inteiro.
 * Saída
 * Escreva todos os divisores positivos de N, um valor por linha.
 */
package uri1157;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int numero=  scanner.nextInt();

        for(int cont=1 ; cont<=numero/2 ; cont++) {
            if(numero%cont==0) {
                System.out.println(cont);
            }
        }
        System.out.println(numero);
    }
}