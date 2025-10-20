package Lesson9;

public class IndustrialBuilding extends Building {
    private String industry;

    public String getIndustry() {
        return industry;
    }

    public IndustrialBuilding(String industry, String street, String material, int year) {
        super(street, material, year);
        this.industry = industry;
    }

    public String info() {
        String info = "отрасль " + industry + super.info();
        return info;
    }

}
