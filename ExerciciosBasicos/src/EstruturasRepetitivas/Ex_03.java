package EstruturasRepetitivas;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;

        System.out.println("Digite um número inteiro: ");
        int x = sc.nextInt();

        for (count = 1; count <= x; count += 2) {
            System.out.println(count);
        }
    }
}
