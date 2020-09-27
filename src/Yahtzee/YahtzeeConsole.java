package Yahtzee;

import java.util.List;

public class YahtzeeConsole extends Console{
    static public void welcome() {
        welcome("Yahtzee");
    }

    static public void displayHand(List<Integer> dice) {
        System.out.println("--------");
    }
}
