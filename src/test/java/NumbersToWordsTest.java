import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

  @Test
  public void turnNumbersToWords_singleDigits_String() {
    NumbersToWords turnNumbersToWords = new NumbersToWords();
    String expected = "nine";
    assertEquals(expected, turnNumbersToWords.turnNumbersToWords("9"));
  }

  @Test
  public void turnNumbersToWords_teens_String() {
    NumbersToWords turnNumbersToWords = new NumbersToWords();
    String expected = "nineteen";
    assertEquals(expected, turnNumbersToWords.turnNumbersToWords("19"));
  }

  @Test
  public void turnNumbersToWords_doubleDigits_String() {
    NumbersToWords turnNumbersToWords = new NumbersToWords();
    String expected = "forty five";
    assertEquals(expected, turnNumbersToWords.turnNumbersToWords("45"));
  }

  @Test
  public void turnNumbersToWords_tripleDigits_String() {
    NumbersToWords turnNumbersToWords = new NumbersToWords();
    String expected = "one hundred forty five";
    assertEquals(expected, turnNumbersToWords.turnNumbersToWords("145"));
  }
}
