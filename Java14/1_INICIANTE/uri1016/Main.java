/**
 * Distância
 * Dois carros (X e Y) partem em uma mesma direção. O carro
 * X sai com velocidade constante de 60 Km/h e o carro Y sai
 * com velocidade constante de 90 Km/h.
 * Em uma hora (60 minutos) o carro Y consegue se distanciar
 * 30 quilômetros do carro X, ou seja, consegue se afastar
 * um quilômetro a cada 2 minutos.
 * Leia a distância (em Km) e calcule quanto tempo leva
 * (em minutos) para o carro Y tomar essa distância do outro carro.
 * Entrada
 * O arquivo de entrada contém um número inteiro.
 * Saída
 * Imprima o tempo necessário seguido da mensagem "minutos".
 */
package uri1016;

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

        int km = scanner.nextInt();
        System.out.println((km*2) + " minutos");
    }
}