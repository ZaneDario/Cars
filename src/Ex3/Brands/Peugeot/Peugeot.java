package Ex3.Brands.Peugeot;
import Ex3.*;

public class Peugeot extends Car {

    public Peugeot(String licensePlate, String RgbColor, int horsepower, Fuels kFuel)
    {
        super(licensePlate, "Peugeot", RgbColor, horsepower, kFuel);
    }

    @Override
    public void start() {
        started = true;
        System.out.println("Starting with the key.");
    }

    @Override
    public void stop() {

        if(speed == 0)
        {
            started = false;
            System.out.println("Stopping with the key.");
        }
        else
            System.out.println("You can stop the car while the car is moving.");

    }
}
