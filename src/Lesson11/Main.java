package Lesson11;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine("Делонги", "Варит", false, 250);
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("Bork", "Печет", false, 300);
        coffeeMachine.start();
        Fridge fridge = new Fridge("Машинка", 350, "Атлант", false);
        Fridge fridge1 = new Fridge("Холодильник", 400, "Samsung", false);

        WachingMachine wachingMachine = new WachingMachine("Стиральная", 450, "LG", false);
        WachingMachine wachingMachine1 = new WachingMachine("Стир", 500, "Lenovo", false);

        VacuumCleaner vacuumCleaner = new VacuumCleaner("Помощник", "Xiaomi", 550, false);
        VacuumCleaner vacuumCleaner1 = new VacuumCleaner("Вредитель", "Viomo", 600, false);

        Electrical[] electricals = {coffeeMachine1, coffeeMachine, fridge1, fridge, wachingMachine, wachingMachine1, vacuumCleaner, vacuumCleaner1};

        for (Electrical a : electricals) {
            a.work();
        }
        Kitchen[] kitchen = {fridge, fridge1, wachingMachine, wachingMachine1};
        for (Kitchen b : kitchen) {
            b.broken();
        }
        CoffeeMachine[] coffee = {coffeeMachine, coffeeMachine1};
        for (CoffeeMachine c : coffee) {
            c.makeCappuchino();
            c.work();
        }

        Student student = new Student("Nastya", "Boruk", "Economy");
        Student student1 = new Student("Olya", "Boruk", "Economy");
        Student student3 = new Student("Sergei", "Boruk", "Economy");
        Table<Integer, Character> table1 = new Table<>(101, student);
        Table<Integer, Character> table2 = new Table<>(101, student);
        Table<Integer, Character> table3 = new Table<>(101, student);

        table1.setCharacterAtTable(student);
        table1.printCharacter();

        table2.setCharacterAtTable(student1);
        table2.printCharacter();

        table3.setCharacterAtTable(student3);
        table3.printCharacter();



    }


}





