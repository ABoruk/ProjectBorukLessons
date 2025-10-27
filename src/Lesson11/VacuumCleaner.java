package Lesson11;
//Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn.
// Класс Пылесос имплементирует интерфейс Электроприборы.
// Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».
public class VacuumCleaner implements Electrical{
    String name;
    String model;
    int price;
    boolean isOn;

    public VacuumCleaner(String name, String model, int price, boolean isOn) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
System.out.println( model +" убирает");
    }
}
