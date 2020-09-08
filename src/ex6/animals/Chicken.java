package ex6.animals;

import ex6.IGrazable;
import ex6.ISlaughterable;

public class Chicken extends Animal implements ISlaughterable, IGrazable {
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void slaughter() {
        System.out.println("My name is " + name + " the chicken, and I'm about to die :'(");
    }

    @Override
    public void graze() {
        System.out.println("Hey, I'm a chicken, my name is " + name + " and I'm grazing.");
    }
}
