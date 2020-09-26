package Yahtzee;

import java.util.Random;

public class Die {
    private int value;
    private int sides = 6;

    /*
    If we do not specify a die - default to 6 sides
     */
    public Die() {
        value = 1;
    }

    /*
    If we do want to specify a die
     */
//    public Die(int sides) {
//        value =1;
//        this.sides = sides;
//    }

    public void roll(Random rand) {
        value = rand.nextInt(sides) +1;
    }

    public int getValue() {
        return value;
    }
}