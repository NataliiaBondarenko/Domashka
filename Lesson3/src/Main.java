public class Main {

    public static void main(String[] args) {
	String str1 = "Hello";
	String str2 = "Wold";
    System.out.println("Chars ->" +
            findCsars(str1, str2));
    }

    public static String findCsars (String str1,
                                    String str2){
        if (checkString(str1) && checkString(str2)) {
        String result ="";
        int len = str1.length();
        int index = 0;
        while (index < len){
            char ch = str1.charAt(index);
            if (str2.indexOf(ch) >= 0 &&
                    !result.contains(String.valueOf(ch))){
                result = result + ch;

            }
            index ++;
        }
        return result;
    }
        return null;
    }

    static boolean checkString(String s) {
        return s != null && s.length() != 0 && s.trim().length() != 0;
    }
}
