package shapes;

public class Rectangle extends Shape {
    private String dot1;
    private String dot2;
    private String dot3;
    private String dot4;

    public Rectangle(String color, String dot1, String dot2, String dot3, String dot4) {
        super(color);
        this.dot1 = dot1;
        this.dot2 = dot2;
        this.dot3 = dot3;
        this.dot4 = dot4;
    }

    @Override
    void draw() {
        // TODO: implement
    }

    // TODO: add equals() method
}
