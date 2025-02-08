package EstruturasCondicionais;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do item: ");
        int item = scanner.nextInt();

        System.out.println("Digite a quantidade do item: ");
        int qtd = scanner.nextInt();

        double valorItem = 0.0;

        switch (item) {
            case 1:
                valorItem = qtd * 4;
                break;
            case 2:
                valorItem = qtd * 4.50;
                break;
            case 3:
                valorItem = qtd * 5;
                break;
            case 4:
                valorItem = qtd * 2;
                break;
            case 5:
                valorItem = qtd * 1.50;
                break;
        }

        System.out.println("Total: R$ " + valorItem);
    }
}
