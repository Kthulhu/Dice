package Dice;

public class RollImpl implements Roll{
    private int result;

    public int rollingDice(Dice dice) {

        result = (int) ((Math.random() * dice.getValue()) + 1);
        if ((result == dice.getValue()) && dice.equals(Dice.D20)) {
            System.out.println("Критическая удача!!!");
            return result;
        } else if ((result == 1) && dice.equals(Dice.D20)) {
            System.out.println("Критическая неудача!!!");
            return result;
        } else System.out.println("Результат броска "+result);
        return result;
    }

}
