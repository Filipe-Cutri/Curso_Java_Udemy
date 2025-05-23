package JavaPOO.Memoria_Listas;

import JavaPOO.Memoria_Listas.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class VetorPorReferencia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Alocado na memória stack
        Product[] vect = new Product[n]; // Alocado na memória heap

        for(int i=0; i<vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for(int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("Average price: %.2f%n", avg);

        sc.close();
    }
}
