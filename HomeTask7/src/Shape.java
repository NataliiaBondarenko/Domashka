public class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Shape class='" + this.getClass() + '\'' + "color='" + this.color + '\'';
    }

    public double calcArea() {
        return 0.0D;
    }
}
