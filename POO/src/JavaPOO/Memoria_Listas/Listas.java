package JavaPOO.Memoria_Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Rebeca");
        list.add("Filipe");
        list.add(2, "Billy");

        System.out.println(list.size());

        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------------");
        list.removeIf(x -> x.charAt(0) == 'F');
        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------------");
        System.out.println("Index of Filipe: " + list.indexOf("Filipe"));
        System.out.println("Index of Mateus: " + list.indexOf("Mateus"));

        System.out.println("----------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
        for(String x : result) {
            System.out.println(x);
        }

        System.out.println("----------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
