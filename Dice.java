package Dice;
public enum Dice {
    D100(100),
    D10(10),
    D12(12),
    D20(20),
    D4(4),
    D6(6),
    D8(8);
    private int value;

    public int getValue() {
        return value;
    }

    Dice(int value) {
        this.value = value;
    }
}
