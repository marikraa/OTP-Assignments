import java.util.Random;

public class Dice {
    private Random random;
    private int die1;
    private int die2;

    public Dice() {
        this.random = new Random();
    }

    public void roll() {
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
    }

    public boolean isDouble() {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        int attempts = 0;
        do {
            dice.roll();
            attempts++;
            System.out.println("Rolled " + dice.getDie1() + " and " + dice.getDie2() + ".");
            if (!dice.isDouble()) {
                System.out.println("Try again.");
            }
        } while (!dice.isDouble());
        System.out.println("You rolled a double!");
        System.out.println("It took " + attempts + " rolls to get a double.");
    }
}