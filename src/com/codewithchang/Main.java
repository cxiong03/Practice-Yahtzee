package com.codewithchang;

import Yahtzee.Hand;
import Yahtzee.YahtzeeConsole;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        YahtzeeConsole.welcome();
        Hand myHand = new Hand();
    }
}
