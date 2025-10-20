package Lesson9;

public class Factory extends IndustrialBuilding {
    private int employee;
    private String products;

    public Factory(int employee, String products, String industry, String street, String material, int year) {
        super(industry, street, material, year);
        this.employee = employee;
        this.products = products;
    }

    public String info() {

        String info = "Кол-во рабочих " + employee + "Продукция " + products + super.info();
        return info;
    }
}

