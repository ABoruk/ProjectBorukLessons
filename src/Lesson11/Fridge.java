package Lesson11;
//Поля: наименование, марка, стоимость, Boolean isOn (включен)
//Переопределите метод work так, чтобы методы выводил «Холодильник морозит»
public class Fridge implements Kitchen,Electrical{
    String name;
    String model;
    int price;
    boolean isOn;

    public Fridge(String name, int price, String model, boolean isOn) {
        this.name = name;
        this.price = price;
        this.model = model;
        this.isOn = isOn;
    }


    public void work() {
        System.out.println(model +" морозит");
    }


    @Override
    public void broken() {

    }
}
