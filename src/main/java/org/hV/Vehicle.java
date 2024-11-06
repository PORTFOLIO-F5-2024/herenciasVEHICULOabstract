package org.hV;

public abstract class Vehicle {
    private String Brand;
    protected int Velocity;
    protected int Wheels;

    public Vehicle(String Brand, int Wheels, int wheels) {
        this.Brand = Brand;
        this.Velocity = 0;
        this.Wheels = Wheels;
    }

    public String getBrand() {
        return Brand;
    }

    public int getVelocity() {
        return Velocity;
    }

    public int getWheels() {
        return Wheels;
    }

    public void setWheels(int wheels) {
        Wheels = wheels;
    }

    public void setVelocity(int velocity) {
        Velocity = velocity;
    }

    public abstract void acceleration () ;

    public abstract void deceleration ();
}
