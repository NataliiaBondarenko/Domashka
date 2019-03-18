public class Books {
    private Book[] book;
    int index = -1;

    public Books() {
    }

    public Books(int size) {
        book = new Book[size];
    }

    public void addBook(Book book) {
        if (index == this.book.length) {
            System.out.println("Извините, но библиотека полная ");
        } else {
            this.book[++index] = book;
        }
    }

    public void showLibrary() {
        if (index < 0) {
            System.out.println("Извините, но библиотека пуста");
        } else {
            for (int a = 0; a <= index; a++) {
                book[a].view();
                System.out.println();
            }
        }
    }

    public void getNewPrice(int percent) {
        for (int a = 0; a <= index; a++) {
            int price = book[a].getPrice();
            price = price + (price / 100 * percent);
            book[a].setPrice(price);
        }
    }

    public int count(int year) {
        int size = 0;
        for (int a = 0; a <= index; a++) {
            if (book[a].getYear() > year) {
                size++;
            }
        }
        System.out.println(size);
        return size;
    }

    public Books findSinceYear(int year) {
        int size = count(year);
        if (size > 0) {
            Books list = new Books(size);
            for (int a = 0; a <= index; a++) {
                if (book[a].getYear() >= year) {
                    list.addBook(book[a]);
                }
            }
            return list;
        } else {
            System.out.println("Не найдено книг старше этого года");
            return new Books(0);
        }
    }

    public int count(String author) {
        int size = 0;
        for (int a = 0; a <= index; a++) {
            if (book[a].getAuthor().equals(author)) {
                size++;
            }
        }
        return size;
    }


    public Books findByAuthor(String author) {
        int size = count(author);
        if (size > 0) {
            Books list = new Books(size);
            for (int a = 0; a <= index; a++) {
                if (book[a].getAuthor().equals(author)) {
                    list.addBook(book[a]);
                }
            }
            return list;
        } else {
            System.out.println("Нет книг с именем данного автора");
            return new Books(0);
        }
    }
}

