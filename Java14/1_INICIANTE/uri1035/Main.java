/**
 * Teste de Seleção 1
 *  Leia 4 valores inteiros A, B, C e D. A seguir,
 *  se B for maior do que C e
 *  se D for maior do que A, e
 *  a soma de C com D for maior que a soma de A e B e
 *  se C e D, ambos, forem positivos e
 *  se a variável A for par
 *  escrever a mensagem "Valores aceitos",
 *  senão escrever "Valores nao aceitos".
 *  Entrada
 *  Quatro números inteiros A, B, C e D.
 *  Saída
 *  Mostre a respectiva mensagem após a validação dos valores.
 */
package uri1035;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        boolean sit1 = false;
        boolean sit2 = false;
        boolean sit3 = false;
        boolean sit4 = false;
        boolean sit5 = false;

        if(B>C) {
            sit1 = true;
        }

        if(D>A) {
            sit2 = true;
        }

        if((C+D)>(A+B)) {
            sit3 = true;
        }

        if(C>=0 && D>=0) {
            sit4 = true;
        }

        if(A%2==0) {
            sit5 = true;
        }

        if(sit1 && sit2 && sit3 && sit4 && sit5) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}