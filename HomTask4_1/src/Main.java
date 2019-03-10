import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пожалуйста число");
        int a = sc.nextInt();
        String   str = checkBit(a);
        System.out.println(" Ваше число в двоичном представлении будет " + str);
    }
        private static  String checkBit(int a)
        {
            String str = " ";
            while (a > 0)
            {
                str = ((a % 2) == 0 ? "0" : "1") + str;
                a = a/2;

            }
            return str;
        }
}


