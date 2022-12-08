import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.example.Main.arabicToRoman;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingClass {
    @Test
    public void given_1_test_I() {
        int ar = 1;
        String result = arabicToRoman(ar);
        Assertions.assertEquals("I", result);
    }
    @Test
    public void given_2_test_II() {
        int ar = 2;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "II");
    }
    @Test
    public void given_3_test_III() {
        int ar = 3;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "III");
    }

    @Test
    public void given_4_test_IV() {
        int ar = 4;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "IV");
    }

    @Test
    public void given_5_test_V() {
        int ar = 5;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "V");
    }

}
