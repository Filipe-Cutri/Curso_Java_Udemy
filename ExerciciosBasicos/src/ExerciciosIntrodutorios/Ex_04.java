package ExerciciosIntrodutorios;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu ID: ");
        int idFuncionario = scanner.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.println("Digite o valor da sua hora R$: ");
        double valorHora  = scanner.nextDouble();

        double salario =  horasTrabalhadas * valorHora;

        System.out.println("Número: " + idFuncionario);
        System.out.println("Salário R$ " + salario);
    }
}
