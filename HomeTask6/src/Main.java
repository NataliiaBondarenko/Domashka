import java.util.Scanner;

public class Main {

    public static int intInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String stringInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Books library = new Books(10);
        Book books1 = new Book(1, "Forbes book: 10 000 мыслей и идей от влиятельных бизнес лижеров и гуру менеджмента (чёрный)", "Гудман", "Эксмо", 2017, 376, 969);
        library.addBook(books1);
        Book books2 = new Book(2, "Букварь", "Н.С. Жукова", "Эксмо", 2018, 96, 149);
        library.addBook(books2);
        Book books3 = new Book(3, "Женщины", "Чарльз Буковски", "Эксмо", 2019, 432, 92);
        library.addBook(books3);
        Book books4 = new Book(4,"Покорность","Уэльбэк Мишель","Эксмо",2016,352,367);
        library.addBook(books4);
        Book books5 = new Book(5,"Мастер и Маргарита","М.Булгаков","АСТ",2016,320,232);
        library.addBook(books5);
        library.showLibrary();
        System.out.print("Введите процент для смены цены: ");
        library.getNewPrice(intInput());

        System.out.print("Введите автора: ");
        library.findByAuthor(stringInput()).showLibrary();
        System.out.print("Введите год: ");
        library.findSinceYear(intInput()).showLibrary();
    }
}