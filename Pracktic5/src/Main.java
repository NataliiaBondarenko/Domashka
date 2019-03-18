import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      int [] arrayInt = createArrayInt(10);
      System.out.println(" Array -> " + Arrays.toString(arrayInt));
      System.out.println("Sub = " + subMaxMin(arrayInt));
    }
    static int [] createArrayInt (int size){
        if (size < 1){
            return null;
        }
        int [] arrayInt =new int [size];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt [i] = (int) (Math.random()* 9);

        }
        return arrayInt;
    }
    static int [] createArray (int size) {...}
    static Integer subMaxMin(int [] array) {
        if (array ==null || array.length < 2 ){
            return null;
        }
        int [] newArrayInt = Arrays.copyOf(array, array.length);
        Arrays.sort(newArrayInt );
        return newArrayInt[newArrayInt.length - 1] - newArrayInt [0];
    }
}
