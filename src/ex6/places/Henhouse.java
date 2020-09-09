package ex6.places;

import ex6.ISlaughterable;
import ex6.animals.Chicken;

import java.util.ArrayList;
import java.util.List;

public class Henhouse {

    public List<ISlaughterable> animals = new ArrayList<>();
    public void addAnimal(ISlaughterable animal)
    {
        animals.add(animal);
    }

    public void collectEggs()
    {
        for (ISlaughterable animal : animals) {
            if(animal instanceof Chicken)
            {
                System.out.println("You picked an egg.");
                return;
            }
        }

        System.out.println("There is no chickens in the henhouse.");
    }
}
