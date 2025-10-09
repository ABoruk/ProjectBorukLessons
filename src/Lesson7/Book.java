package Lesson7;

public class Book {
    int id;
    String name;
    String author;
    String publish;
    int year;
    int amount;
    double price;

    public Book(int id, String name, String author, String publish, int year, int amount, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.amount = amount;
        this.price = price;
    }

    public void info() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(author);
        System.out.println(publish);
        System.out.println(year);
        System.out.println(amount);
        System.out.println(price);

    }

    public void newPrice(double newPrice) {
        price = newPrice;
    }

    public static Book[] getBooks(Book[] books, int mark) {
        int count = 0;
        for (Book books1 : books) {
            if (books1.year < mark) {
                count++;
            }
        }
        Book[] bookResult = new Book[count];
        int a = 0;
//
//
        for (Book books1 : books) {
            if (books1.year < mark) {
                bookResult[a++] = books1;
            }
        }
        return bookResult;
    }
}
