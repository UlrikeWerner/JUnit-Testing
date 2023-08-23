import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    // Aufgabe 1
    @Test
    void returnSumFromTwoNumbers() {
        int a = 3;
        int b = 5;

        int actual = Main.sumOfTwoNumbers(a, b);

        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    // Aufgabe 2
    @Test
    void returnTrueByEvenNumber() {
        int a = 6;

        boolean actual = Main.isEven(a);

        Assertions.assertTrue(actual);
    }

    @Test
    void returnFalseByOddNumber() {
        int a = 5;

        boolean actual = Main.isEven(a);

        Assertions.assertFalse(actual);
    }

    // Aufgabe 3
    @Test
    void returnProductOfTwoNumbers() {
        int a = 6;
        int b = 2;

        int actual = Main.productOfTwoNumbers(a, b);

        int expected = 12;
        Assertions.assertEquals(expected, actual);
    }

    // Aufgabe 4
    @Test
    void returnUpperCaseOfString() {
        String word = "neue Fische";

        String actual = Main.changeToUpperCase(word);

        String expected = "NEUE FISCHE";
        Assertions.assertEquals(expected, actual);
    }

    // Aufgabe 5
    @Test
    void returnTrueForPositivNumbers() {
        int number = 4;

        boolean actual = Main.isPositivNumber(number);

        Assertions.assertTrue(actual);
    }

    @Test
    void returnFalseForNegativeNumbers() {
        int number = -2;

        boolean actual = Main.isPositivNumber(number);

        Assertions.assertFalse(actual);
    }
}
