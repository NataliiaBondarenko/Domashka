public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double x, double y, double i) {
        super(color);
        this.a = x;
        this.b = y;
        this.c = i;
    }

    public String toString() {
        return super.toString() + " a = " + this.a + " b = " + this.b + " c = " + this.c;
    }

    public double calcArea() {
        double p = (this.a + this.b + this.c) / 2.0D;
        return Math.sqrt((p - this.c) * (p - this.b) * (p - this.a) * p);
    }
}
