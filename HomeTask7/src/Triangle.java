public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double x, double y, double i) {
        super(color);
        this.a = x;
        this.b = y;
        this.c = i;
    }

    @Override
    public String toString() {
        return super.toString() +
                " a = " + a +
                " b = " + b +
                " c = " + c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt((p - c) * (p - b) * (p - a)*p);
    }
}