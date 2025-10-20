package Lesson9;

public class Building extends Village {
    private String street;
    private String material;
    private int year;

    public Building(String street, String material, int year) {
        this.street = street;
        this.material = material;
        this.year = year;

    }

    public String info() {

        String info = "Улица " + street + "Материал " + material + year;
        return info;
    }
}
