package Ex3.Brands.Peugeot.Models;

import Ex3.Brands.Peugeot.Peugeot;
import Ex3.Fuels;

public class Traveller extends Peugeot {

    public Traveller(String licensePlate, String RgbColor,int horsepower)
    {
        super(licensePlate,RgbColor,horsepower, Fuels.gasoline);
    }
}
