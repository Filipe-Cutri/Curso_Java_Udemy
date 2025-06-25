package JavaPOO.Map.Example01;

import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com.br");
        cookies.put("phone", "9991110099");
        cookies.remove("email");
        cookies.put("phone", "9999180099");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("emmail"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES:");
        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
