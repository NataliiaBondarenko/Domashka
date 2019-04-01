
public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + "radius = " + this.radius;
    }

    public double calcArea() {
        return 3.141592653589793D * this.radius * this.radius;
    }
}