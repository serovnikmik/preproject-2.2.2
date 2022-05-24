package web.models;

public class Car {

    private String model;
    private int number;
    private int maxSpeed;

    public Car(){

    }

    public Car(String model, int number, int maxSpeed) {
        this.model = model;
        this.number = number;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
