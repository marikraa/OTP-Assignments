import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    TemperatureConverter tc = new TemperatureConverter();

    @Test
    public void fahrenheitToCelsius() {
        assertEquals(0, tc.fahrenheitToCelsius(32));
    }

    @Test
    public void celsiusToFahrenheit() {
        assertEquals(32, tc.celsiusToFahrenheit(0));
    }

    @Test
    public void isExtremeTemperature() {
        assertEquals(true, tc.isExtremeTemperature(-41));
        assertEquals(false, tc.isExtremeTemperature(50));
    }

    @Test
    public void Maria_Aalto() {
        assertEquals(0, 0);
    }
}