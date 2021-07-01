package shapes;

public class Main {

    public static void main(String[] args) {
        final Circle circle1 = new Circle("Red", "(0,0)", 5.9);
        final Circle circle2 = new Circle("Blue", "(0,0)", 5.9);
        final Rectangle rectangle1 = new Rectangle("Green", "(2,2)", "(0,0)", "(2,0)", "(0,2)");
        final Rectangle rectangle2 = new Rectangle("Green", "(2,2)", "(0,0)", "(2,0)", "(0,2)");

        final Shape[] shapes = {circle1, circle2, rectangle1, rectangle2};
        for (Shape s : shapes) {
            s.draw();
        }
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(rectangle1));
        System.out.println(rectangle1.equals(rectangle2));
    }
}
