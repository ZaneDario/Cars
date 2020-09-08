package ex6.places;

import ex6.animals.Animal;

public class Barn {

    public Animal[] animals = new Animal[5];

    public void addAnimal(Animal animal)
    {
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] == null)
            {
                animals[i] = animal;
                break;
            }
        }

        System.out.println("There is no available space.");
    }
}
