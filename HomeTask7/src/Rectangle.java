public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return super.toString() + " width = " + this.width + " height = " + this.height;
    }

    public double calcArea() {
        return this.width * this.height;
    }
}
