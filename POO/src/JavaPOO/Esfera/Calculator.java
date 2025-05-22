package JavaPOO.Esfera;

public class Calculator {

    public static final double PI = 3.14159;

    protected static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    protected static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
