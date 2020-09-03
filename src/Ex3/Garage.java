package Ex3;

import Ex3.Vehicles.Cars.Car;

public class Garage {
    private Car[] cars;
    public boolean opened = true;

    public Garage(int space)
    {
        cars = new Car[space];
    }

    public void addCar(Car car)
    {
        if(opened)
        {
            for (int i = 0; i < cars.length; i++) {
                if(cars[i] == null)
                {
                    cars[i] = car;
                    System.out.println("Car added to the parking.");
                    return;
                }
            }
            System.out.println("There is no available space.");
        }
        else
            System.out.println("Parking is closed.");
    }

    public void extractCar(int index)
    {
        if(cars.length <= index)
        {
            index--;

            if(cars[index] == null)
                System.out.println("There is not car parking there.");
            else {
                System.out.println("Car extracted.");
                cars[index] = null;
            }
        }
        else
            System.out.println("This parking hasn't got so many parking places.");
    }

    public void extractCar(String licensePlate)
    {
        for (Car car: cars) {
            if(car != null && car.licensePlate.equals(licensePlate))
            {
                System.out.println("Car extracted.");
                return;
            }
        }
        System.out.println("That license plate is not registered in ths parking.");
    }
}
