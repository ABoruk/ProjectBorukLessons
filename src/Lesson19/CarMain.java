package Lesson19;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CarMain {
    public static void main(String[] args) {
        Auto auto1 = new Auto(1, "Ford", 50000, 250, 16000);
        Auto auto2 = new Auto(2, "Geely", 500000, 380, 17000);
        Auto auto3 = new Auto(3, "BMW", 300000, 400, 18000);
        Auto auto4 = new Auto(4, "BMW", 80000, 3260, 19000);
        Auto auto5 = new Auto(5, "BMW", 12000, 4000, 20000);
        List<Auto> cars = List.of(auto1, auto2, auto3, auto4, auto5);

        List<Auto> list = cars.stream().filter(car -> car.getProbeg() > 50000 && car.getProbeg() < 100000).toList();
        System.out.println(list);
        Optional<Auto> result = cars.stream().max(Comparator.comparing(Auto::getSpeed));
        if (result.isPresent()) {
            System.out.println(result.get());
        }
        List<String> model = cars.stream().map(car -> {
            return car.getModel();
        }).distinct().toList();
        System.out.println(model);
        Auto car1 = cars.stream().filter(car -> {
            if (car.getModel().equals("BMW") && car.getSpeed() > 300) {
                return true;
            } else return false;
        }).findFirst().orElseThrow(() -> new CarNotFoundException("такой машины нет"));
        System.out.println(car1);


    }

}


