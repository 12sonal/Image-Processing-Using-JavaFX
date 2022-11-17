package Exercise0.model;

public class Book {
    // Creating 8 variables
    private int id;
    private String name;
    private String author;
    private int publishedYear;
    private int qty;
    private int pages;
    private double price;
    private String currencyType;

    public Book(int id, String name, String author, int publishedYear, int qty, int pages, double price, String currencyType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
        this.qty = qty;
        this.pages = pages;
        this.price = price;
        this.currencyType = currencyType;
        System.out.println("Instance created of class3 Book with id " + id + " and name " + name);
    }

    // Creating 3 methods
    public void read(int page) {
        System.out.println("Reading page " + page);
    }

    public boolean closing() {
        System.out.println("Closing book");
        return true;
    }

    public boolean open() {
        System.out.println("Opening book");
        return true;
    }
}
