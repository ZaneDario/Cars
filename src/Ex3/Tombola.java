package Ex3;

import Ex3.Vehicles.Cars.Brands.Mercedes.Models.CLS;
import Ex3.Vehicles.Cars.Brands.Mercedes.Models.Citan;
import Ex3.Vehicles.Cars.Brands.Peugeot.Models.Hybrid;
import Ex3.Vehicles.Cars.Brands.Peugeot.Models.Traveller;
import Ex3.Vehicles.Cars.Car;

import java.util.Random;

public class Tombola {
    public static Car randomCar()
    {
        int random = new Random().nextInt(4);

        switch (random)
        {
            case 0: return new Traveller("5444DDD","500050",290);
            case 1: return new Hybrid("6444DDD","500050",290);
            case 2: return new CLS("7444DDD","500050",290);
            default: return new Citan("8444DDD","500050",290);
        }
    }
}
