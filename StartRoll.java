package Dice;

public class StartRoll {
    public static void main(String[] args) {
        Roll roll = new RollImpl();
        roll.rollingDice(Dice.D4);
        roll.rollingDice(Dice.D6);
        roll.rollingDice(Dice.D8);
        roll.rollingDice(Dice.D10);
        roll.rollingDice(Dice.D20);
        roll.rollingDice(Dice.D20);
        roll.rollingDice(Dice.D20);
        roll.rollingDice(Dice.D20);
        roll.rollingDice(Dice.D20);
        roll.rollingDice(Dice.D20);


    }
}
