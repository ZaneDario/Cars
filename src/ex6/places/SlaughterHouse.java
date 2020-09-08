package ex6.places;

import ex6.ISlaughterable;
import ex6.animals.Animal;

public class SlaughterHouse {

    public void slaughter(Henhouse henhouse, ISlaughterable animal)
    {
        for (ISlaughterable bird: henhouse.animals) {
            if(bird.equals(animal))
            {
                animal.slaughter();
                henhouse.animals.remove(animal);
            }
        }
    }
}
