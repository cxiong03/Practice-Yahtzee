package com.codewithchang;

import Yahtzee.Die;
import Yahtzee.Console;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
	    Die die = new Die();
        System.out.println(die.getValue());
        die.roll(rand);
        System.out.println(die.getValue());
        die.roll(rand);
        System.out.println(die.getValue());
        die.roll(rand);
        System.out.println(die.getValue());
    }
}
