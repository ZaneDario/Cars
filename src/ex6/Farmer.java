package ex6;

import ex6.animals.Animal;
import ex6.places.Farm;

public class Farmer {

    Farm farm;

    public void moveAnimal(IGrazable animal)
    {
        for (int i = 0; i < farm.henhouse.animals.size(); i++)
        {
            Animal grazable = (Animal)farm.henhouse.animals.get(i);
            if(grazable.equals(animal))
            {
                farm.henhouse.animals.remove(grazable);
                farm.enclosure.animals.add(grazable);
                System.out.println("Good boy, " + grazable.getName());
                return;
            }
        }
        for (int i = 0; i < farm.barns.size(); i++)
        {
            for (int j = 0; j < 5; j++)
            {
                Animal grazable = farm.barns.get(i).animals[j];
                if(grazable.equals(animal))
                {
                    farm.barns.get(i).animals[j] = null;
                    farm.enclosure.animals.add(grazable);
                    System.out.println("Good boy, " + grazable.getName());
                    return;
                }
            }
        }

    }

}
