/**
 * Média 1
 * Leia 2 valores de ponto flutuante de dupla precisão A e B,
 * que correspondem a 2 notas de um aluno. A seguir, calcule
 * a média do aluno, sabendo que a nota A tem peso 3.5 e a
 * nota B tem peso 7.5 (A soma dos pesos portanto é 11).
 * Assuma que cada nota pode ir de 0 até 10.0, sempre com uma
 * casa decimal.
 * Entrada
 * O arquivo de entrada contém 2 valores com uma casa decimal
 * cada um.
 * Saída
 * Imprima a mensagem "MEDIA" e a média do aluno conforme
 * exemplo abaixo, com 5 dígitos após o ponto decimal e
 * com um espaço em branco antes e depois da igualdade.
 * Utilize variáveis de dupla precisão (double) e como
 * todos os problemas, não esqueça de imprimir o fim de
 * linha após o resultado, caso contrário, você receberá
 * "Presentation Error".
 */
package uri1005;

import java.io.IOException;
import java.text.DecimalFormat;
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

        float A = scanner.nextFloat();
        float B = scanner.nextFloat();

        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println("MEDIA = " + df.format(((A*3.5+B*7.5)/11)));
    }
}