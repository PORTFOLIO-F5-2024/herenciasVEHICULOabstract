package org.hV;

public class Motorbike extends Vehicle{
    public Motorbike(String Brand, int Wheels) {
        super(Brand, Wheels, Wheels);
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
        this.Velocity += 30;
    }

    @Override
    public void deceleration() {
        this.Velocity -= 10;
    }
}
