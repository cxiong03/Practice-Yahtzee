package Yahtzee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
    private List<Die> dice;

    public Hand() {
        dice = new ArrayList<Die>();
        for (int count = 0; count < 5; count++) {
//            var die = new Die();
            dice.add(new Die());
        }
    }

    public void roll(Random rand) {
        for (var die : dice) {
            die.roll(rand);
        }
    }

    public void roll(Random rand, int choice) {
        dice.get(choice).roll(rand);
    }

    public void roll(Random rand, List<Integer> choices) {
        for (int choice : choices) {
            roll(rand, choice);
        }
    }

    public List<Die> getDice() {
        return dice;
    }
}
