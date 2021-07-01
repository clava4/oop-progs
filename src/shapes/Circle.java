package shapes;

import java.util.Objects;

public class Circle extends Shape {

    final private String dot1;
    final private double radius;

    public Circle(String color, String dot1, double radius) {
        super(color);
        this.dot1 = dot1;
        this.radius = radius;
    }

    public String getDot1() {
        return dot1;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    protected void draw() {
        System.out.println("Draw circle with color: " + getColor() + ", center at: " +
                getDot1() + ", and radius: " + getRadius());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Objects.equals(dot1, circle.dot1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dot1, radius);
    }
}
