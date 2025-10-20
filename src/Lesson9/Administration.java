package Lesson9;

public class Administration extends CivilBuilding {
    private String purposeadm;
    private int amount;


    public Administration(String purpose, int floor, String street, String material, int year, String purposeadm, int amount) {
        super(purpose, floor, street, material, year);
        this.purposeadm = purposeadm;
        this.amount = amount;
    }
}
