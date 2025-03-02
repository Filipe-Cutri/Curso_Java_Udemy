package ExerciciosIntrodutorios;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int b = scanner.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int c = scanner.nextInt();

        System.out.println("Digite o quarto valor: ");
        int d = scanner.nextInt();

        int diferenca = a * b - c * d;

        System.out.println("DIFERENÇA = " + diferenca);
    }
}
