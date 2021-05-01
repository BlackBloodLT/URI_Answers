/**
 * Soma de Ímpares Consecutivos III
 * Leia um valor inteiro N que é a quantidade de casos
 * de teste que vem a seguir. Cada caso de teste consiste
 * de dois inteiros X e Y. Você deve apresentar a soma de Y
 * ímpares consecutivos a partir de X inclusive o próprio X
 * se ele for ímpar. Por exemplo:
 * para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
 * para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13
 * Entrada
 * A primeira linha de entrada é um inteiro N que é a quantidade
 * de casos de teste que vem a seguir. Cada caso de teste consiste
 * em uma linha contendo dois inteiros X e Y.
 * Saída
 * Imprima a soma dos consecutivos números ímpares a partir do valor X.
 */
package uri1158;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeCasos = scanner.nextInt();

        for(int cont=1 ; cont<=quantidadeCasos ; cont++) {
            int soma = 0;

            int numeroInicial = scanner.nextInt();
            if(numeroInicial%2==0) {
                numeroInicial++;
            }

            int quantidadeTermos = scanner.nextInt();

            for(int cont2=1 ; cont2<=quantidadeTermos ; cont2++) {
                soma += numeroInicial;
                numeroInicial += 2;
            }
            System.out.println(soma);
        }
    }
}