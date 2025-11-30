package Lesson19;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainNumber {
    public static void main(String[] args) {


        List<Integer> number1 = List.of(2, 4, 6, 8);
        List<Integer> number2 = List.of(1, 3, 5, 7);
        List<Integer> number3 = List.of(20, 40, 60, 80);
        List<Integer> number4 = List.of(10, 30, 50, 70);

        NumberGenerator numberGenerator1 = new NumberGenerator(number1);
        NumberGenerator numberGenerator2 = new NumberGenerator(number2);
        NumberGenerator numberGenerator3 = new NumberGenerator(number3);
        NumberGenerator numberGenerator4 = new NumberGenerator(number4);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> future1 = executorService.submit(numberGenerator1);
        Future<String> future2 = executorService.submit(numberGenerator2);
        Future<String> future3 = executorService.submit(numberGenerator3);
        Future<String> future4 = executorService.submit(numberGenerator4);
    }

}
