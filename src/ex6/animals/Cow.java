package ex6.animals;

import ex6.IGrazable;

public class Cow extends Animal implements IGrazable {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void graze() {
        System.out.println("Hey, I'm a cow, my name is " + name + " and I'm grazing.");
    }
}
