package EstruturasRepetitivas;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senhaRecebida = 0;

        while (senhaRecebida != senhaCorreta) {
            senhaRecebida = sc.nextInt();
            System.out.println("Senha inválida");
        }
        System.out.println("Acesso permitido");
    }
}
