package Ex3;

public abstract class Car {

    protected boolean started = false;
    protected int horsepower;
    protected String brand;
    protected String licensePlate;
    protected String RgbColor;
    protected int fuel;
    protected float speed;

    public Car(String brand, String licensePlate, String RgbColor, int horsepower)
    {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.RgbColor = RgbColor;
        this.horsepower = horsepower;
    }

    protected abstract void start();
    protected abstract void stop();
    protected void refuel(int amount){
        fuel = fuel + amount > 100 ? 100 : fuel+amount;
    }
    protected int getFuel()
    {
        System.out.println(fuel);
        return fuel;
    }

    protected String getBrand()
    {
        return brand;
    }

    protected void drive(){
        if(started)
        {
            fuel -= 12;
            System.out.println("Brum brummmm");
        }
        else
            System.out.println("Starting needed.");
    }
}
