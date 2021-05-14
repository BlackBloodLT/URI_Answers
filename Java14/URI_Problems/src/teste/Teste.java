package teste;

/**
 * TODO: isto é um teste
 *  linha1
 *  linha2
 */

/**
 * FIXME: isso é um teste
 *  linha3
 *  linha4
 */

import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double numeroCasos = scanner.nextInt();

        System.out.println(numeroCasos);
    }
}