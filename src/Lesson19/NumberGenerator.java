package Lesson19;

import java.util.List;
import java.util.concurrent.Callable;

public class NumberGenerator implements Callable {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"start");
        int result = numbers.stream().mapToInt(number->number).sum();
        Thread.sleep(5500);
        return String.valueOf(result);

    }

    public NumberGenerator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    private List<Integer>numbers;

    }

