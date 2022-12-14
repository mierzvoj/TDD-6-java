import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.arabicToRoman;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
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
    @Test
    public void given_9_test_IX() {
        int ar = 9;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "IX");
    }
    @Test
    public void given_10_test_X() {
        int ar = 10;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "X");
    }
    @Test
    public void given_40_test_XL() {
        int ar = 40;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "XL");
    }

    @Test
    public void given_50_test_L() {
        int ar = 50;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "L");
    }

    @Test
    public void given_90_test_XC() {
        int ar = 90;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "XC");
    }

    @Test
    public void given_100_test_C() {
        int ar = 100;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "C");
    }

    @Test
    public void given_400_test_CD() {
        int ar = 400;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "CD");
    }

    @Test
    public void given_500_test_D() {
        int ar = 500;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "D");
    }
    @Test
    public void given_900_test_CM() {
        int ar = 900;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "CM");
    }

    @Test
    public void given_1000_test_M() {
        int ar = 1000;
        String result = arabicToRoman(ar);
        Assertions.assertEquals(result, "M");
    }
}
