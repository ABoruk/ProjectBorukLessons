package Lesson11;

public class Student extends Character{
    String faculty;

    public Student(String name, String surname,String faculty) {
        super(name, surname);
        this.faculty=faculty;
    }

    public String getFaculty() {
        return faculty;
    }


}
