/**
 * Média 2
 * Leia 3 valores, no caso, variáveis A, B e C, que são
 * as três notas de um aluno. A seguir, calcule a média
 * do aluno, sabendo que a nota A tem peso 2, a nota B
 * tem peso 3 e a nota C tem peso 5. Considere que cada
 * nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 * Entrada
 * O arquivo de entrada contém 3 valores com uma casa
 * decimal, de dupla precisão (double).
 * Saída
 * Imprima a mensagem "MEDIA" e a média do aluno conforme
 * exemplo abaixo, com 1 dígito após o ponto decimal e com
 * um espaço em branco antes e depois da igualdade. Assim
 * como todos os problemas, não esqueça de imprimir o fim
 * de linha após o resultado, caso contrário, você receberá
 * "Presentation Error".
 */
package uri1006;

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

        float A = scanner.nextFloat()*2;
        float B = scanner.nextFloat()*3;
        float C = scanner.nextFloat()*5;

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("MEDIA = " + df.format((A+B+C)/10));
    }
}