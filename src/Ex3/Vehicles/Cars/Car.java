package Ex3.Vehicles.Cars;

import Ex3.Fuels;
import Ex3.IMusicable;

public abstract class Car implements IMusicable {

    protected boolean started = false;
    protected Fuels kindOfFuel;
    protected int horsepower;
    protected String brand;
    public String licensePlate;
    protected String RgbColor;
    protected int fuel;
    protected float speed;

    public Car(String brand, String licensePlate, String RgbColor, int horsepower, Fuels kFuel)
    {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.RgbColor = RgbColor;
        this.horsepower = horsepower;
        this.kindOfFuel = kFuel;
    }

    public abstract void start();
    public abstract void stop();
    public void refuel(int amount){
        fuel = fuel + amount > 100 ? 100 : fuel+amount;
    }
    public int getFuel()
    {
        System.out.println(fuel);
        return fuel;
    }

    public Fuels getKindOfFuel()
    {
        return kindOfFuel;
    }

    public String getBrand()
    {
        return brand;
    }

    protected void speedUp(int amount)
    {
        if(started && fuel > 0)
        {
            fuel -= 0.5f * amount;
            speed += amount;
        }
    }

    protected void speedDown(int amount)
    {
        if(started && speed > 0)
        {
            speed -= amount;

            speed = speed < 0 ? 0 : speed;
        }
    }

    public void drive(){
        if(started)
        {
            fuel -= 12;
            System.out.println("Brum brummmm");
        }
        else
            System.out.println("Starting needed.");
    }
}
