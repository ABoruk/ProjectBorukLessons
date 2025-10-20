package Lesson9;

public class CivilBuilding extends Building {
    private String purpose;
    private int floor;

    public CivilBuilding(String purpose,int floor,String street, String material, int year) {
        super(street, material, year);
        this.purpose = purpose;
        this.floor = floor;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getFloor() {
        return floor;
    }
}
