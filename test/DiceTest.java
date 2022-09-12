import demo.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void diceRoll() {
        Dice dice = new Dice();

        int roll;

        for (int i = 0; i < 1000; i++) {
            roll = dice.diceRoll();

            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}