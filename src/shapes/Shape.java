package shapes;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract void draw();

}
