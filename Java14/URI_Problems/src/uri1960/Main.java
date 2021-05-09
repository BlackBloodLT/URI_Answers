/**
 * Numeração Romana para Números de Página
 * A ECI (Editio Chronica Incredibilis ou Editora de Crônicas
 * Incríveis) é muito tradicional quando se trata de numerar
 * as páginas de seus livros. Ela sempre usa a numeração romana
 * para isso. E seus livros nunca ultrapassam as 999 páginas
 * pois, quando necessário, dividem o livro em volumes.
 * Você deve escrever um programa que, dado um número arábico,
 * mostra seu equivalente na numeração romana.
 * Lembre que I representa 1, V é 5, X é 10, L é 50, C é 100,
 * D é 500 e M representa 1000.
 * Entrada
 * A entrada é um número inteiro positivo N (0 < N < 1000).
 * Saída
 * A saída é o número N escrito na numeração romana em uma
 * única linha. Use sempre letras maiúsculas.
 */
package uri1960;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        ArrayList<Integer> vetorNumeroArabico = new ArrayList<Integer>();
        vetorNumeroArabico.add(1000);
        vetorNumeroArabico.add(900);
        vetorNumeroArabico.add(500);
        vetorNumeroArabico.add(400);
        vetorNumeroArabico.add(100);
        vetorNumeroArabico.add(90);
        vetorNumeroArabico.add(50);
        vetorNumeroArabico.add(40);
        vetorNumeroArabico.add(10);
        vetorNumeroArabico.add(9);
        vetorNumeroArabico.add(5);
        vetorNumeroArabico.add(4);
        vetorNumeroArabico.add(1);

        ArrayList<String> vetorNumeroRomano = new ArrayList<String>();
        vetorNumeroRomano.add("M");
        vetorNumeroRomano.add("CM");
        vetorNumeroRomano.add("D");
        vetorNumeroRomano.add("CD");
        vetorNumeroRomano.add("C");
        vetorNumeroRomano.add("XC");
        vetorNumeroRomano.add("L");
        vetorNumeroRomano.add("XL");
        vetorNumeroRomano.add("X");
        vetorNumeroRomano.add("IX");
        vetorNumeroRomano.add("V");
        vetorNumeroRomano.add("IV");
        vetorNumeroRomano.add("I");

        int cont = 0;

        while(valor>0) {
            if(valor>=vetorNumeroArabico.get(cont)) {
                System.out.print(vetorNumeroRomano.get(cont));
                valor -= vetorNumeroArabico.get(cont);
            } else {
                cont++;
            }
        }

        System.out.println("");
    }
}