/**
 * Triângulo
 * Ana e suas amigas estão fazendo um trabalho de geometria
 * para o colégio, em que precisam formar vários triângulos,
 * numa cartolina, com algumas varetas de comprimentos
 * diferentes. Logo elas perceberam que não dá para formar
 * triângulos com três varetas de comprimentos quaisquer:
 * se uma das varetas for muito grande em relação às outras
 * duas, não dá para formar o triângulo.
 * Neste problema, você precisa ajudar Ana e suas amigas a
 * determinar se, dados os comprimentos de quatro varetas,
 * é ou não é possível selecionar três varetas, dentre as
 * quatro, e formar um triângulo.
 * Entrada
 * A entrada é composta por apenas uma linha contendo quatro
 * números inteiros A, B, C e D (1 ≤ A, B, C, D ≤ 100).
 * Saída
 * Seu programa deve produzir apenas uma linha contendo apenas
 * um caractere, que deve ser ‘S’ caso seja possível formar o
 * triângulo, ou ‘N’ caso não seja possível formar o triângulo.
 */
package uri1929;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> vetor = new ArrayList<Integer>();
        vetor.add(scanner.nextInt());
        vetor.add(scanner.nextInt());
        vetor.add(scanner.nextInt());
        vetor.add(scanner.nextInt());

        // Como são 4 valores, são possíveis 4 combinações
        // Combinação vetor(0), vetor(1), vetor(2)
        // Combinação vetor(0), vetor(1), vetor(3)
        // Combinação vetor(0), vetor(2), vetor(3)
        // Combinação vetor(1), vetor(2), vetor(3)

        int ladoA;
        int ladoB;
        int ladoC;

        if(testeTriangulo(vetor.get(0), vetor.get(1), vetor.get(2))) {
            System.out.println("S");
        } else if(testeTriangulo(vetor.get(0), vetor.get(1), vetor.get(3))) {
            System.out.println("S");
        } else if(testeTriangulo(vetor.get(0), vetor.get(2), vetor.get(3))) {
            System.out.println("S");
        } else if(testeTriangulo(vetor.get(1), vetor.get(2), vetor.get(3))) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }

    public static boolean testeTriangulo(int ladoA, int ladoB, int ladoC) {
        boolean formaTriangulo = false;
        if((ladoA<ladoB+ladoC) && (ladoB<ladoA+ladoC) && (ladoC<ladoB+ladoA)) {
            formaTriangulo = true;
        } else if((ladoA>=ladoB+ladoC) || (ladoB>=ladoA+ladoC) || (ladoC>=ladoB+ladoA)){
            formaTriangulo = false;
        }
        return formaTriangulo;
    }
}