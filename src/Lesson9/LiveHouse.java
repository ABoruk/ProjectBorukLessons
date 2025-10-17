package Lesson9;

public class LiveHouse extends CivilBuilding {
    private int appartment;

    public LiveHouse(String purpose, int floor, String street, String material, int year, int appartment) {
        super(purpose, floor, street, material, year);
        this.appartment = appartment;
    }
}
