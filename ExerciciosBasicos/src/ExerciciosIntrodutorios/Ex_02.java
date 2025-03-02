package ExerciciosIntrodutorios;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        int raio = scanner.nextInt();

        double areaCirculo = 3.14159 * Math.pow(raio, 2);

        System.out.println("A = " + areaCirculo);
    }
}
