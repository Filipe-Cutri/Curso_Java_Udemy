package JavaPOO.Esfera;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator oCalculator = new Calculator();

        System.out.printf("Enter radius: ");
        double radius = sc.nextDouble();

        double c = oCalculator.circumference(radius);
        double v = oCalculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", oCalculator.PI);

        sc.close();
    }
}
