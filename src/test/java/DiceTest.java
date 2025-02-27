import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void roll() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6);
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6);
    }

    @Test
    void isDouble() {
        Dice dice = new Dice();
        boolean isDouble = dice.isDouble();
        assertEquals(dice.getDie1() == dice.getDie2(), isDouble);
    }
}