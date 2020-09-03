package Ex3;

import Ex3.Brands.Mercedes.Models.*;
import Ex3.Brands.Peugeot.Models.*;

public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage(3);

        System.out.println("--------------------");

        Car peugeot = new Traveller("1111AAA",150);
        peugeot.start();
        peugeot.drive();
        garage.addCar(peugeot);

        System.out.println("--------------------");

        Car mercedesCitan = new Citan("2222BBB",405);
        mercedesCitan.drive();
        garage.addCar(mercedesCitan);

        System.out.println("--------------------");

        Car mercedesCLS = new CLS("3333CCC",320);
        mercedesCLS.refuel(100);
        mercedesCLS.getFuel();
        mercedesCLS.start();
        mercedesCLS.drive();
        mercedesCLS.getFuel();
        mercedesCLS.refuel(10);
        mercedesCLS.getFuel();
        mercedesCLS.stop();
        garage.addCar(mercedesCLS);

        System.out.println("--------------------");

        Car hybrid = new Hybrid("4444DDD",290);
        garage.addCar(hybrid);

        System.out.println("--------------------");

        garage.extractCar(3);
        garage.extractCar("3333CCC");

        System.out.println("--------------------");

        garage.addCar(hybrid);
    }
}
