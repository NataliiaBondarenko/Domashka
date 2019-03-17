import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число элементов маcсива");
        int number = sc.nextInt();

        int[] arrayInt = createArrayInt(number);

        System.out.println("У нас массив" + Arrays.toString(arrayInt));

        System.out.println("Сумма нечетных чисел " + amtAndSumOfOddElementsOfArray(arrayInt)[0] +
                " колличество нечетных чисел "  + amtAndSumOfOddElementsOfArray(arrayInt)[1]);

    }

    static int[] createArrayInt(int size){
        if (size < 1){
            return null;
        }
        int[] arrayInt = new int[size];

        for (int a= 0; a<arrayInt.length; a++){
            arrayInt[a] = (int)(Math.random() * 20);
        }

        return arrayInt;
    }

    static int[] amtAndSumOfOddElementsOfArray (int[] array){
        int sum = 0;
        int amt =0;
        for(int a =0; a<array.length; a++){
            if (array[a] % 2 != 0 ){
                sum += array[a];
                amt++;
            }
        }
        int[] Array ={sum,amt};
        return Array;
    }
}