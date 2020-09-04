package ex5;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public List<Animal> animals = new ArrayList<>();

    public void show(Animal animal)
    {
        System.out.println(animal.show());
    }

    public void show()
    {
        for (Animal animal: animals) {
            System.out.println(animal.show());
        }
    }

    public void show(Animal[] animals)
    {
        for (Animal animal: animals) {
            System.out.println(animal.show());
        }
    }
}
