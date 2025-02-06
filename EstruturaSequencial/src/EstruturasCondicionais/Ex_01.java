package EstruturasCondicionais;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        if (n1 >= 0) {
            System.out.println("Não Negativo");
        } else {
            System.out.println("Negativo");
        }
    }
}
