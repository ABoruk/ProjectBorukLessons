package Lesson11;
//Поля наименование, бренд, стоимость, Boolean isOn.
// Класс стиральная машина имплементирует интерфейс Электроприборы.
// Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».
public class WachingMachine implements Kitchen,Electrical{
    String name;
    int price;
    String model;
    boolean isOn;

    public WachingMachine(String name, int price, String model, boolean isOn) {
        this.name = name;
        this.price = price;
        this.model = model;
        this.isOn = isOn;
    }

    @Override
    public void broken() {

    }

    public void work() {
        System.out.println(model+ " стирает");
    }
}
