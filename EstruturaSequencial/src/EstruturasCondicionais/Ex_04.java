package EstruturasCondicionais;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora do início do jogo: ");
        int a = scanner.nextInt();

        System.out.println("Digite a hora do fim do jogo: ");
        int b = scanner.nextInt();

        int duracaoJogo;
        if (a < b) {
            duracaoJogo = b - a;
        } else if (a > b) {
            duracaoJogo = 24 - a + b;
        } else {
            duracaoJogo = 24;  
        }

        System.out.println("O jogo durou: " + duracaoJogo + " hora(s)");
    }
}
