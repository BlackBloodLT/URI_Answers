/**
 * MacPRONALTS
 * O MacPRONALTS está com uma super promoção, exclusivo para
 * os competidores da primeira Seletiva do MaratonaTEC. Só
 * que teve um problema, todos os maratonistas foram tentar
 * comprar ao mesmo tempo, com isso gerou uma fila muito grande.
 * O pior é que a moça do caixa estava sem calculadora ou um
 * programa para ajudá-la a calcular com maior agilidade, eis
 * que surge você para fazer um programa para ajudar a coitada
 * e aumentar a renda do MacPRONALTS. Segue o cardápio do
 * dia contendo o número do produto e seu respectivo valor.
 * 1001 | R$ 1.50
 * 1002 | R$ 2.50
 * 1003 | R$ 3.50
 * 1004 | R$ 4.50
 * 1005 | R$ 5.50
 * Entrada
 * A primeira entrada informada é a quantidade de produtos
 * comprados (1 <= p <= 5). Para cada produto segue a quantidade
 * (1 <= q <= 500) que o consumidor comprou.
 * Obs.: não poderão ser informados números de produtos repetidos.
 * Saída
 * Você deve imprimir o valor da compra com duas casas decimais.
 */
package uri1985;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeCasos = scanner.nextInt();
        double soma = 0;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        for(int cont=1 ; cont<=quantidadeCasos ; cont++) {
            int opcao = scanner.nextInt();
            int quantidadeOpcao = scanner.nextInt();

            switch(opcao) {
                case 1001: {
                    soma += quantidadeOpcao*1.5;
                    break;
                }
                case 1002: {
                    soma += quantidadeOpcao*2.5;
                    break;
                }
                case 1003: {
                    soma += quantidadeOpcao*3.5;
                    break;
                }
                case 1004: {
                    soma += quantidadeOpcao*4.5;
                    break;
                }
                case 1005: {
                    soma += quantidadeOpcao*5.5;
                    break;
                }
                default: {
                    break;
                }
            }
        }
        System.out.println(decimalFormat.format(soma));
    }
}