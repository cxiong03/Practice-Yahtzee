package Yahtzee;

import java.util.List;

public class YahtzeeConsole extends Console{
    static public void welcome() {
        welcome("Yahtzee");
    }

    static public void displayHand(List<Die> dice) {
        System.out.println("---------");
        for (var die : dice) {
            System.out.print(die.getValue() + " ");
        }
        System.out.print("\n");
    }
}
