 class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private int price;

    public Book() {
    }

    public Book(int id, String name, String author, String publisher, int year, int pages, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public void view() {
        System.out.println("ID" + id);
        System.out.println("Имя" + name);
        System.out.println("Автор" + author);
        System.out.println("Издание" + publisher);
        System.out.println("Год издания" + year);
        System.out.println("Колличество страниц" + pages);
        System.out.println("Цена" + price + " Грн");
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
