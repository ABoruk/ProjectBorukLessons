package Lesson7;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(1, "Преступление", "Достоевский", "Аверсэв", 1990, 2, 2000);
        book.info();
        book.newPrice(5000);
        Book[] books = {
                new Book(1, "1984", "George Orwell", "Secker & Warburg", 1949, 5, 12.99),
                new Book(2, "To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960, 3, 10.50),
                new Book(3, "The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925, 7, 9.99),
                new Book(4, "Harry Potter", "J.K. Rowling", "Bloomsbury", 1997, 10, 14.99)
        };

        Book[] result = Book.getBooks(books, 1945);
        for (Book s : result) {
            s.info();
        }
        String str = "I like Java";
        int length = str.length();
        char result1 = str.charAt(length - 1);
        System.out.println(result1);

        boolean end = str.endsWith("Java");
        System.out.println(end);

        //Вырезать строку Java c помощью метода String.substring().
        String sub = str.substring(7, 11);
        System.out.println(sub);
    }
}
