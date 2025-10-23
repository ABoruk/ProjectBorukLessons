package Lesson11;

public class Table<T1 , T2 extends Character> {
    private T1 inventoryName;
    private T2 characterAtTable;

    public Table(T1 inventoryName, T2 characterAtTable) {
        this.inventoryName = inventoryName;
        this.characterAtTable = characterAtTable;
    }

    public void printCharacter() {

        System.out.println(characterAtTable.getName());
    }

    public T2 getCharacterAtTable() {
        return characterAtTable;
    }

    public void setCharacterAtTable(T2 characterAtTable) {
        this.characterAtTable = characterAtTable;

    }
public Table(){};
    public T1 getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(T1 inventoryName) {
        this.inventoryName = inventoryName;
    }


//        Первый дженерик будет отображать инвертарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
//        6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.
//        7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
//        8. Вывести поочередно  имена персонажей, которые сидят за столом.
}

