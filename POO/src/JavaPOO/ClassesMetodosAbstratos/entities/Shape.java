package JavaPOO.ClassesMetodosAbstratos.entities;

import JavaPOO.ClassesMetodosAbstratos.entities.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
