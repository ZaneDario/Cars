package Ex3.Vehicles.Cars.Brands.Mercedes;
import Ex3.*;
import Ex3.Vehicles.Cars.Car;

public class Mercedes extends Car {

    public Mercedes(String licensePlate, String RgbColor,int horsepower, Fuels kFuel) {
        super(licensePlate,"Mercedes", RgbColor,horsepower, kFuel);
    }

    @Override
    public void start() {
        started = true;
        System.out.println("Starting by pressing a button.");
    }

    @Override
    public void stop() {
        if(speed == 0)
        {
            started = false;
            System.out.println("Stopping by pressing a button.");
        }
        else
            System.out.println("You can stop the car while the car is moving.");
    }

}
