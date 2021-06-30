package shapes;

public class Main {

    public static void main(String[] args) {
        final Circle circle = new Circle("Red", "(0,0)", 5.9);
        final Rectangle rectangle = new Rectangle("Blue", "(2,2)", "(0,0)", "(2,0)", "(0,2)");

        final Shape[] shapes = {circle, rectangle};
        for (Shape s : shapes) {
            s.draw();
        }
    }
}
