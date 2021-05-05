/**
 * Matriz 123
 * Leia um valor inteiro N que é o tamanho da
 * matriz que deve ser impressa conforme o modelo
 * fornecido.
 * Entrada
 * A entrada contém vários casos de teste e termina
 * com EOF. Cada caso de teste é composto por um
 * único inteiro N (3 ≤ N < 70), que determina o
 * tamanho (linhas e colunas) de uma matriz que
 * deve ser impressa.
 * Saída
 * Para cada N lido, apresente a saída conforme o
 * exemplo fornecido.
 */
package uri1534;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int ordem;

        while(scanner.hasNext()) {
            ordem = scanner.nextInt();
            int[][] matriz = new int[ordem][ordem];

            for(int linha=0 ; linha<ordem ; linha++) {
                for(int coluna=0 ; coluna<ordem ; coluna++) {
                    if((linha+coluna)==ordem-1) {
                        matriz[linha][coluna] = 2;
                    } else if(linha==coluna) {
                        matriz[linha][coluna] = 1;
                    } else {
                        matriz[linha][coluna] = 3;
                    }
                    System.out.print(matriz[linha][coluna]);
                }
                System.out.println("");
            }
        }
    }
}