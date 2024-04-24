package org.example.creational.prototype;

public class TwoWheelerVehicle extends Vehicle {
    private boolean isElectric;


    public TwoWheelerVehicle(String engine, String model, long price, boolean isElectric) {
        super(engine, model, price);
        this.isElectric = isElectric;
    }


    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}