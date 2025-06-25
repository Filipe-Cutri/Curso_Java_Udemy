package JavaPOO.EqualsHashCode.Example01;

import JavaPOO.EqualsHashCode.Example01.entities.Cliente;

public class Program {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Maria", "maria@gmail.com");
        Cliente c2 = new Cliente("Antonio", "antonio@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
    }
}
