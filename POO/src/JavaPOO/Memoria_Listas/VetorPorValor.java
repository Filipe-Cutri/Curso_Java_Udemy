package JavaPOO.Memoria_Listas;

import java.util.Locale;
import java.util.Scanner;

public class VetorPorValor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Alocado na memória stack
        double[] vect = new double[n]; // Alocado na memória heap

        for(int i=0; i<n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0;

        for(int i=0; i<n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.println("Average height: " + avg);

        sc.close();
    }
}
