package ExerciciosIntrodutorios;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = 3.14159 * (Math.pow(c, 2));
        double areaTrapezio = (a + b) * c /2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;

        System.out.println("Triangulo: " + areaTriangulo);
        System.out.println("Círculo: " + areaCirculo);
        System.out.println("Trapézio: " + areaTrapezio);
        System.out.println("Quadrado: " + areaQuadrado);
        System.out.println("Retângulo: " + areaRetangulo);
    }
}
