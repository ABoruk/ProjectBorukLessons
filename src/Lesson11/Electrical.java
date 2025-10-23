package Lesson11;

public interface Electrical {
    void work();
    default void start(){
        System.out.println("Электроприбор стартует");
    }
}
