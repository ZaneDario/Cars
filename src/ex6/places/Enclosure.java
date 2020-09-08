package ex6.places;

import ex6.IGrazable;
import ex6.animals.Animal;
import ex6.animals.Cow;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {

    public List<Animal> animals = new ArrayList<>();

    public void graze(IGrazable animal)
    {

    }

    public void countAnimals()
    {
        int cows = 0;
        int chickens = 0;

        for (Animal animal: animals) {
            if(animal instanceof Cow)
                cows++;
            else
                chickens++;
        }

        System.out.println("There are " + (cows + chickens) + " animals in this enclosure. " +
                "\n" + cows + " are cows, and " + chickens + " are chickens.");
    }
}
