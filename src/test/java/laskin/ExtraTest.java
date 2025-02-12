package laskin;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ExtraTest {

    private static Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @BeforeAll
    public static void testVirtaON() {
        System.out.println("@BeforeAll Virta ON (ennen ensimmäistä testiä)");
        laskin.virtaON();
    }

    @AfterAll
    public static void testVirtaOFF() {
        System.out.println("@AfterAll Virta OFF (kaikki testit ajettu).");
        laskin.virtaOFF();
        laskin = null;
    }

    @BeforeEach
    public void testNollaa() {
        System.out.println("  Nollaa laskin.");
        laskin.nollaa();
        assertEquals(0, laskin.annaTulos(), DELTA, "Nollaus ei onnistunut");
    }

    @ParameterizedTest(name = "Luvun {0} neliö on {1}")
    @CsvSource({ "2, 4", "4, 16", "5, 25" })
    public void testNelio(int luku, int tulos) {
        laskin.nelio(luku);
        assertEquals(tulos, laskin.annaTulos(), DELTA, "Neliöön korotus ei nyt kyllä skulaa");
    }

    @ParameterizedTest(name = "Luvun {0} neliöjuuri on {1}")
    @CsvSource({ "4, 2", "9, 3", "16, 4" })
    public void testNeliojuuri(int luku, double tulos) {
        laskin.neliojuuri(luku);
        assertEquals(tulos, laskin.annaTulos(), DELTA, "Neliöjuuri väärin");
    }

    @Test
    @DisplayName("Testaa negatiivinen neliöjuuri")
    public void testNeliojuuriNegat() {
        ArithmeticException poikkeus = assertThrows(ArithmeticException.class, () -> laskin.neliojuuri(-1));
        assertEquals("Neliöjuurta ei voi laskea", poikkeus.getMessage());
    }
}
