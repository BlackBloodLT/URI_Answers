/**
 * A Resposta de Theon
 * Ramsay: "(...) você vence se conseguir adivinhar quem eu sou
 * e por que estou torturando você."
 * Theon deve pensar rápido e adivinhar quem é seu algoz!
 * Entretanto, Ramsay já decidiu o que ele irá fazer depois
 * que Theon der sua resposta.
 * Theon pode dizer que seu algoz é alguma dentre N pessoas.
 * Considere que as pessoas são numeradas de 1 a N. Se Theon
 * responder que seu algoz é a pessoa i, Ramsay irá atingi-lo Ti vezes.
 * Sua tarefa é ajudar Theon a determinar qual deve ser sua
 * resposta de forma a minimizar o número de vezes que ele
 * será atingido.
 * Entrada
 * A primeira linha contém um inteiro N (1 ≤ N ≤ 100). A segunda
 * linha contém N inteiros T1, T2, ..., TN (0 ≤ Ti ≤ 20).
 * Saída
 * Imprima uma linha contendo o número da pessoa que Theon deve
 * dizer ser seu algoz. Se existe mais de uma resposta possível,
 * imprima a menor.
 */
package uri1858;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int quantidadeCasos = scanner.nextInt();
        int carrasco;
        int menor = 0;
        int indice = 0;

        for(int cont=1 ; cont<=quantidadeCasos ; cont++) {
            carrasco = scanner.nextInt();
            if(cont==1) {
                indice = 1;
                menor = carrasco;
            } else if(carrasco<menor) {
                indice = cont;
                menor = carrasco;
            }
        }
        System.out.println(indice);
    }
}