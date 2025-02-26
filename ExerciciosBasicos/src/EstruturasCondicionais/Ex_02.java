package EstruturasCondicionais;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int n1 = scanner.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }
}
