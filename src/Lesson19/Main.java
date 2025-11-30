package Lesson19;

public class Main {
    public static void main(String[] args){
    Multiplication multiplication1=(int a,int b) -> {
        return a * b;
    };
int c=multiplication1.multiplication(4,5);
    System.out.println(c);
    Multiplication divide=(int a,int b)->{
        return a/b;
    };
    int d=divide.multiplication(6,2);
        System.out.println(d);
        Multiplication add=(int a,int b)->{
            return a+b;
        };
        int e=add.multiplication(5,8);
        System.out.println(e);
}
}
