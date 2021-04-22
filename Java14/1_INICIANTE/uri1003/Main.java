package uri1003;

/**
 * Soma Simples
 * Leia dois valores inteiros, no caso para variáveis A e B.
 * A seguir, calcule a soma entre elas e atribua à variável SOMA.
 * A seguir escrever o valor desta variável.
 * Entrada
 * O arquivo de entrada contém 2 valores inteiros.
 * Saída
 * Imprima a mensagem "SOMA" com todas as letras maiúsculas,
 * com um espaço em branco antes e depois da igualdade seguido
 * pelo valor correspondente à soma de A e B. Como todos os problemas,
 * não esqueça de imprimir o fim de linha após o resultado,
 * caso contrário, você receberá "Presentation Error".
 */
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

        System.out.println("SOMA = " + (A+B));
    }
}
