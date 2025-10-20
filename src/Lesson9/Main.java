package Lesson9;

public class Main {
    public static void main(String[] args){
        Factory factory=new Factory(5 , "test ", "здание ", "Ленина ", "кирпич ", 1993);
        Factory factory1=new Factory(3, "test1 ","сооружение ","Пушк ","минвата ",1995);
        Building factory2=new Factory(4, "test2 ","сооружение ","Пу ","та ",1996);
//        factory.info();
//        System.out.print(factory.info());
        Village villages=new Village ();
        villages.addBuilding(factory);
        villages.addBuilding(factory1);
        villages.addBuilding(factory2);
villages.info1();

    }
}
