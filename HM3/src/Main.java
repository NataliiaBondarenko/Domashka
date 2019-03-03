
import java.io.IOException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println(" Нажмите 1");
            System.out.println(" Нажмите 2");
            System.out.println(" Нажмите 3");
            System.out.println(" Нажмите 4");
            System.out.println(" Нажмите 5");
            choice = (char)System.in.read();

            char ignore;
            do {
                ignore = (char)System.in.read();
            } while(ignore != '\n');
        } while(choice < '1' | choice > '5');

        System.out.println("\n");
        int a;
        int b;
        switch(choice) {
            case '1':
                int c;
                for(c = 0; c < 10; ++c) {
                    for(a = 0; a < 11 && a != c; ++a) {
                        System.out.print(" * ");
                    }

                    System.out.println();
                }

                for(c = 0; 10 > c; ++c) {
                    for(a = 10; a > 0 && c != a; --a) {
                        System.out.print(" * ");
                    }

                    System.out.println();
                }

                return;
            case '2':
                for(a = 0; a < 10; ++a) {
                    for(b = 0; b < a; ++b) {
                        System.out.print(" ");
                    }

                    for(b = 0; b < 10 - a; ++b) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

                return;
            case '3':
                for(a = 0; a < 10; ++a) {
                    for(b = 0; b < 10 - a; ++b) {
                        System.out.print(" ");
                    }

                    for(b = 0; b < a; ++b) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

                return;
            case '4':
                for(a = 0; a < 10; ++a) {
                    for(b = 0; b < 10 - a; ++b) {
                        System.out.print(" ");
                    }

                    for(b = 0; b < a; ++b) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

                for(a = 0; a < 10; ++a) {
                    for(b = 0; b < a; ++b) {
                        System.out.print(" ");
                    }

                    for(b = 0; b < 10 - a; ++b) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

                return;
            case '5':
                for(a = 0; a < 2; ++a) {
                    for(b = 0; b <= 4; ++b) {
                        int d;
                        for(d = 0; d <= 4 - b; ++d) {
                            System.out.print(' ');
                        }

                        for(d = 0; d <= 2 * b; ++d) {
                            System.out.print('*');
                        }


                        System.out.println();
                    }
                }

                System.out.println();
        }

    }
}
