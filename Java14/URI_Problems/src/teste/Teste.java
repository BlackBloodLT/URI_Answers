package teste;


import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numeroCasos = scanner.nextInt();

        for(int cont=1 ; cont<=numeroCasos ; cont++) {

            System.out.println(scanner.nextInt()%2);
        }
    }
}