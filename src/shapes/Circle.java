package shapes;

public class Circle extends Shape {

    private String dot1;
    private double radius;

    public Circle(String color, String dot1, double radius) {
        super(color);
        this.dot1 = dot1;
        this.radius = radius;
    }

    @Override
    void draw() {
        // TODO: implement
    }

    // TODO: add equals() method
}
