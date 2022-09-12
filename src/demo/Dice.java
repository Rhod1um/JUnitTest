package demo;

import java.util.Random;

public class Dice {
    Random random = new Random();

    public int diceRoll(){
        int randomNum = random.nextInt(6)+1;
        return randomNum;
    }


}
