package ex6.animals;

import ex6.ISlaughterable;

public class Turkey extends Animal implements ISlaughterable {
    public Turkey(String name) {
        super(name);
    }

    @Override
    public void slaughter() {
        System.out.println("My name is " + name + " the turkey, and I'm about to die :'(");
    }
}
