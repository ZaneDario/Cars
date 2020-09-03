package Ex3.Brands.Mercedes.Models;

import Ex3.Brands.Mercedes.Mercedes;
import Ex3.Fuels;

public class CLS extends Mercedes {

    public CLS(String licensePlate, String RgbColor,int horsepower)
    {
        super(licensePlate, RgbColor, horsepower, Fuels.ethanol);
    }
}
