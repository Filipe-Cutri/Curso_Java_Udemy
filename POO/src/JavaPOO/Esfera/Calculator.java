package JavaPOO.Esfera;

public class Calculator {

    public final double PI = 3.14159;

    protected double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    protected double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
