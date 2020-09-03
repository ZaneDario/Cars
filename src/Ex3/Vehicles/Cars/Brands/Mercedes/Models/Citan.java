package Ex3.Vehicles.Cars.Brands.Mercedes.Models;

import Ex3.Vehicles.Cars.Brands.Mercedes.Mercedes;
import Ex3.Fuels;

public class Citan extends Mercedes {

    public Citan(String licensePlate,String RgbColor, int horsepower)
    {
        super(licensePlate,RgbColor,horsepower, Fuels.petroleum);
    }
}
