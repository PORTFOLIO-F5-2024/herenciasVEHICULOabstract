package org.hV;

public class Car extends Vehicle {
    public Car(String Brand, int Velocity, int Wheels) {
        super(Brand, Velocity,Wheels);
    }

    @Override
    public int getVelocity() {
        return super.getVelocity();
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void acceleration() {
        this.Velocity += 20;
    }

    @Override
    public void deceleration() {
        this.Velocity -= 20;
    }

}
