package Lesson13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
//1.2Добавить  пару записей (Привет, Как дела, Праздник, Суфле)
//1.3 Вывести все записи.
//1.4 Проверить, содержит ли коллекция слово Конфета
//1.5 Посчитать количество элементов в коллекции
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        List<String> words = new ArrayList<>();
        String string1 = new String("Привет");
        String string2 = new String("Как дела");
        String string3 = "Праздник";
        String string4 = "Суфле";
        words.add(string1);
        words.add(string2);
        words.add(string3);
        words.add(string4);
        for (String word : words) {
            System.out.println(word);
        }
        boolean result = words.contains("Конфета");
        System.out.println(result);
        int result1 = words.size();
        System.out.println(result1);

    }


    public static void task2() {
//        List<String> purchases = List.of("Молоко", "Хлеб", "Батон", "Конфеты", "Зефир");
        List<String> purchases = new ArrayList<>();
        String purchase1 = "Молоко";
        String purchase2 = "Хлеб";
        String purchase3 = "Батон";
        String purchase4 = "Конфеты";
        String purchase5 = "Зефир";
        purchases.add(purchase1);
        purchases.add(purchase2);
        purchases.add(purchase3);
        purchases.add(purchase4);
        purchases.add(purchase5);


        printList(purchases);
        purchases.remove(purchase1);
        printList(purchases);

    }

    private static void printList(List<String> purchases) {
        for (String purch : purchases) {
            System.out.println(purch);

        }

    }


    public static void task3() {
        Book book1 = new Book("Преступление", "Достоевский");
        Book book2 = new Book("Наказание", "Достоевский");
        Book book3 = new Book("Муму", "Тургенев");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
//        books.remove(book2);

        for (Book book : books) {
            System.out.println(book);

        }

    }

}

