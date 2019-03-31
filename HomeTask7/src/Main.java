import java.util.Random;

public class Main {
    static int arrayLength = 14;
    final static int RANDOM_NUMBER = 15;


    public static void main(String[] args) {
        Shape[] shape = new Shape[arrayLength];

        makeShapes(shape);
        showShapes(shape);

        System.out.println("\n Total area  sum - " + getAreaSumForAllShapes(shape));
        System.out.println("\n Total area  sum of Rectangle - " + getAreaSumByType(Rectangle.class,shape));
        System.out.println("\n Total area  sum of Triangle - " + getAreaSumByType(Triangle.class,shape));
        System.out.println("\n Total area  sum of Circle - " + getAreaSumByType(Circle.class,shape));
        double[] areaSums= getAreaSums(shape);

        System.out.println("\n Total area  sum as array - " );
        for(int i=0; i<areaSums.length; i++)
        {
            System.out.println("\n"+areaSums[i]);
        }
    }

    public static void makeShapes(Shape[] shapes) {
        String[] color = {"white", "black", "pink", "blue", "brown", "orange"};//white black pink blue brown orange
        Random random = new Random();

        for(int i=0; i<8; i++)
        {
            int foll = random.nextInt(color.length);
            Circle circle = new Circle(color[foll], random.nextInt(RANDOM_NUMBER));
            shapes[i] = circle;
        }

        for(int i=8; i<12; i++)
        {
            int foll = random.nextInt(color.length);
            Rectangle rectangle = new Rectangle(color[foll],
                    random.nextInt(RANDOM_NUMBER),
                    random.nextInt(RANDOM_NUMBER));
            shapes[i] = rectangle;
        }

        int foll = random.nextInt(color.length);
        shapes[12] = new Triangle(color[foll],
                3,
                4,
                5);
        foll = random.nextInt(color.length);
        shapes[13] = new Triangle(color[foll],
                7,
                8,
                9);

        System.out.println("Completed");
    }

    public static void showShapes (Shape[] shapes) {

        for(int i=0; i<shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }
    }

    public static double getAreaSumForAllShapes(Shape[] shapes) {

        double allArea =0.0;
        for (Shape row : shapes) {

            allArea  += row.calcArea();
        }
        return allArea;
    }

    public static double getAreaSumByType(Class c , Shape[] shapes) {

        double sum =0.0;
        for (Shape row : shapes) {
            if (c.isInstance(row)) {
                sum += row.calcArea();
            }
        }
        return sum;
    }

   public static double[] getAreaSums( Shape[] shapes) {

        double triangleArea = 0.0;
        double circleArea = 0.0;
        double rectangleArea = 0.0;
        for (Shape row : shapes) {

           if (row instanceof Rectangle) {
                rectangleArea += row.calcArea();
            } else if (row instanceof Triangle) {
                triangleArea += row.calcArea();
            } else {
                circleArea += row.calcArea();
            }
        }
        return new double[] {rectangleArea,  triangleArea ,circleArea};
    }
}