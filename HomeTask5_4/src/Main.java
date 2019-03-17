import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите целое число элементов массива ");

        int number = sc.nextInt();
        int[] arrayInt = createArrayInt(number);
        System.out.println("У нас массив " + Arrays.toString(arrayInt));
        System.out.println( " Положительные элементы " + Arrays.toString(positiveAndNegativeArray(arrayInt)[1]) + " Отрицательные элементы "
                + Arrays.toString(positiveAndNegativeArray(arrayInt)[0]));

    }


    static int[] createArrayInt(int size){
        if (size < 1){
            return null;
        }
        int[] arrayInt = new int[size];

        for (int a= 0; a < arrayInt.length; a++){
            arrayInt[a] = (int)(-20 + Math.random() * 20);
        }

        return arrayInt;
    }

    static int[][] positiveAndNegativeArray(int[] array){
        int[] sortarray = Arrays.copyOf(array,array.length);
        Arrays.sort(sortarray);


        int negativeAmt =0;
        for (int a = 0 ;a < array.length; a++ ) {
            if (sortarray[a]<0){
                negativeAmt++;
            }
        }
        int[] posArr = new int[sortarray.length-negativeAmt];
        int[] negArr = new int[negativeAmt];

        int posA = 0,posB = 0;

        for(int i = 0; i<sortarray.length; i++){
            if (sortarray[i]>=0) {
                posArr[posA] = sortarray[i];
                posA++;
            } else {
                negArr[posB] = sortarray[i];
                posB++;
            }
        }

        int[][] returnArray = {negArr,posArr};

        return returnArray;
    }
}