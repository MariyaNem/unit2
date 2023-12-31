package main.java.Vehicle;

public class Car extends Vehicle {

    public Car(String company, String model, int yearRelease) {
        super.numWheels = 4;
        super.speed = 0;
        super.company = company;
        super.model = model;
        super.yearRelease = yearRelease;
    }

    @Override
    void testDrive() {
        this.speed = 60;
    }

    @Override
    void park() {
        this.speed = 0;
    }
}
