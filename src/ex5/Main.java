package ex5;

import ex5.animals.Eagle;
import ex5.animals.Lion;
import ex5.animals.Turtle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal lion = new Lion();
        Animal turtle = new Turtle();
        Animal eagle = new Eagle();

        zoo.show(lion);
        zoo.show(turtle);
        zoo.show(eagle);

        System.out.println("----------------");

        zoo.animals.add(lion);
        zoo.animals.add(turtle);
        zoo.show();

        System.out.println("----------------");

        zoo.show(new Animal[]{eagle, turtle});
    }
}
