package ExerciciosIntrodutorios;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da peça 1: ");
        int idPeça1 = scanner.nextInt();

        System.out.println("Digite o número de peças 1: ");
        int qtdPecas1 = scanner.nextInt();

        System.out.println("Digite o valor unitário da peça 1 R$: ");
        double vlrUnitarioPeca1  = scanner.nextDouble();

        System.out.println("Digite o código da peça 2: ");
        int idPeça2 = scanner.nextInt();

        System.out.println("Digite o número de peças 2: ");
        int qtdPecas2 = scanner.nextInt();

        System.out.println("Digite o valor unitário da peça 2 R$: ");
        double vlrUnitarioPeca2  = scanner.nextDouble();

        double valorTotal = (qtdPecas1 * vlrUnitarioPeca1) + (qtdPecas2 * vlrUnitarioPeca2);

       System.out.println("Valor a pagar: R$ " + valorTotal);
    }
}
