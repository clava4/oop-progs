package shapes;

public abstract class Shape {

    // TODO: can be final
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    // TODO: add protected modifier
    abstract void draw();

    // TODO: add equals() method
}
