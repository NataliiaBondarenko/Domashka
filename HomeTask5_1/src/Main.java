
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число элементов маcсива");

        int number = sc.nextInt();

        int[] arrayInt = reverArrayInt(number);

        System.out.println("У нас массив " + Arrays.toString(arrayInt) +
                " после метода преобразования мы получили" +
                Arrays.toString(reverOfArrays(arrayInt)));
    }
    static int[] reverArrayInt(int size){
        if (size < 1){
            return null;
        }
        int[] arrayInt = new int[size];

        for (int a= 0; a<arrayInt.length; a++){
            arrayInt[a] = (int)(Math.random() * 20);
        }

        return arrayInt;
    }

    static int[] reverOfArrays (int[] array){
        int[] arrayrezult = Arrays.copyOf(array,array.length);

        int temp = 0;
        for (int a = 0 ; a < ((arrayrezult.length) / 2) ; a++){
            temp = arrayrezult[arrayrezult.length - a - 1];
            arrayrezult[arrayrezult.length - a - 1] = arrayrezult[a] ;
            arrayrezult[a] = temp;
        }

        return arrayrezult;
    }
}

