package Ex3.Vehicles.Cars.Brands.Peugeot;
import Ex3.*;
import Ex3.Vehicles.Cars.Car;

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

    @Override
    public void PlayMusic() {
        System.out.println("Playing on a car.");
    }

    @Override
    public void StopMusic() {

    }

    @Override
    public void SkipSong() {

    }

    @Override
    public void BackSong() {

    }
}
