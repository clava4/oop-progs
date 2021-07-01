package shapes;

import java.util.Objects;

public abstract class Shape {

    final private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    protected abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
