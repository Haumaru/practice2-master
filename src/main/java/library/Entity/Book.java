package library.Entity;

public class Book {
    int id;
    String name;
    String author;
    int price;
    static int count = 1;

    public Book() {
        this.id = count;
        count++;
    }

    public Book(String name, String author, int price) {
        this.id = count;
        this.name = name;
        this.author = author;
        this.price = price;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
