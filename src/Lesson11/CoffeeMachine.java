package Lesson11;
//Поля наименование. Список функционала. Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы.
// Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».
public class CoffeeMachine implements Electrical{
    String name;
    String list;
    boolean isOn;
    int price;

    public CoffeeMachine(String name, String list, boolean isOn, int price) {
        this.name = name;
        this.list = list;
        this.isOn = isOn;
        this.price = price;
    }

    @Override
    public void start() {
        isOn=true;
    System.out.println(name +" стартует");

    }

    @Override
    public void work() {
System.out.println( name +" варит кофе");
    }
public void makeCappuchino(){
        System.out.println(name+" варит каппучино");
}


}
