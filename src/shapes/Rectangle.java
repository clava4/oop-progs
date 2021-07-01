package shapes;

import java.util.Objects;

public class Rectangle extends Shape {
    final private String dot1;
    final private String dot2;
    final private String dot3;
    final private String dot4;

    public Rectangle(String color, String dot1, String dot2, String dot3, String dot4) {
        super(color);
        this.dot1 = dot1;
        this.dot2 = dot2;
        this.dot3 = dot3;
        this.dot4 = dot4;
    }

    public String getDot1() {
        return dot1;
    }

    public String getDot2() {
        return dot2;
    }

    public String getDot3() {
        return dot3;
    }

    public String getDot4() {
        return dot4;
    }

    @Override
    protected void draw() {
        System.out.println("Draw rectangle with color: " + getColor() + ", and angular dots: " +
                getDot1() + ", " + getDot2() + ", " + getDot3() + ", " + getDot4());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(dot1, rectangle.dot1) && Objects.equals(dot2, rectangle.dot2) &&
                Objects.equals(dot3, rectangle.dot3) && Objects.equals(dot4, rectangle.dot4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dot1, dot2, dot3, dot4);
    }
}
