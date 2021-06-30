package shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", "(0,0)", 5.9);
        Rectangle rectangle = new Rectangle("Blue", "(2,2)", "(0,0)", "(2,0)", "(0,2)");
        Shape[] shapes = {circle, rectangle};
        for (Shape s : shapes) {
            s.draw();
        }
    }
}
