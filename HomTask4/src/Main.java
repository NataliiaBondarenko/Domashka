import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пожалуйста строку ->");
        String str = sc.nextLine();
        System.out.println("Символы" + FindUniquesSymbols(str) + " из " + str + " уникальные ");

    }

    static String FindUniquesSymbols(String str) {
        String str2 = " ";
        for (int a = 0; a < str.length(); a++) {
            boolean Unigue = true;
            for (int b = 0; b < str.length(); b++) {
                if (a != b && str.charAt(a) == str.charAt(b)) {
                    Unigue = false;
                    break;
                }
            }
            if (Unigue == true) {
                str2 += str.charAt(a);

            }
        }
        return str2;
    }
}