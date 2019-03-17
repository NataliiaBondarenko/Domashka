import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число эллементов масива");
        int num = sc.nextInt();

        int[] arrayInt1 = createArrayInt(num);
        int[] arrayInt2 = createArrayInt(num);

        System.out.println(" Первый массив" + Arrays.toString(arrayInt1)+ " и второй массив" +
                 Arrays.toString(arrayInt2)+"" +
                "создает третий массив, который составляют суммы парных из первого и второго массива начиная с первых двух "
                + "РЕЗУЛЬТАТ" + Arrays.toString(sumArrays(arrayInt1,arrayInt2)));
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


    static int[] sumArrays (int[] array1,int[] array2) {
        int[] arraytake1 = Arrays.copyOf(array1, array1.length);
        int[] arraytake2 = Arrays.copyOf(array2, array2.length);
        int[] myArray = new int[array1.length];
        for (int a = 0 ; a <array1.length ; a++){
            myArray[a] = array1[a]+array2[a];
        }
        return myArray;
    }

}