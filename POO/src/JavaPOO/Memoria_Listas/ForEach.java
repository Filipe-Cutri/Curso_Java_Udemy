package JavaPOO.Memoria_Listas;

import java.util.Locale;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[] {"Maria", "Rebeca", "Filipe"};

        for(int i=0; i<vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("--------------------------------");

        for (String obj : vect) {
            System.out.println(obj);
        }

        sc.close();
    }
}
