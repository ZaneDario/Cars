package Ex3.Vehicles.Cars.Brands.Mercedes.Models;

import Ex3.Vehicles.Cars.Brands.Mercedes.Mercedes;
import Ex3.Fuels;
import Ex3.IConvertible;

public class CLS extends Mercedes implements IConvertible {

    public CLS(String licensePlate, String RgbColor,int horsepower)
    {
        super(licensePlate, RgbColor, horsepower, Fuels.ethanol);
    }

    @Override
    public void putHoodUp() {
        System.out.println("Hood set up.");
    }

    @Override
    public void putHoodDown() {
        System.out.println("Hood set up.");
    }
}
