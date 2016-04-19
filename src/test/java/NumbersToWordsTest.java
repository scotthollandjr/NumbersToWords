import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

  @Test
  public void turnNumbersToWords_singleDigits_String() {
    NumbersToWords turnNumbersToWords = new NumbersToWords();
    String expected = ["one"];
    assertEquals(expected, turnNumbersToWords.turnNumbersToWords(1));
  }

}
