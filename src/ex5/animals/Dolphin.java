package ex5.animals;

import ex5.Animal;
import ex5.ISwimmable;

public class Dolphin extends Animal implements ISwimmable {
    @Override
    public String show() {
        return null;
    }

    @Override
    public String swim() {
        return "";
    }
}
