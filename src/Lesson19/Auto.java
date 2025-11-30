package Lesson19;

public class Auto {
    private int id;
    private String model;
    private int probeg;
    private int speed;
    private int price;

    public Auto(int id, String model, int  probeg, int speed, int price) {
        this.id = id;
        this.model = model;
        this.probeg = probeg;
        this.speed = speed;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProbeg() {
        return probeg;
    }

    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", probeg='" + probeg + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
