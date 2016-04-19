import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class NumbersToWords {
  public static void main(String[] args) {

  }

  public static String turnNumbersToWords(String inputNumber) {

    HashMap<String, String> singleDigits = new HashMap<String, String>();
    singleDigits.put("1", "one");
    singleDigits.put("2", "two");
    singleDigits.put("3", "three");
    singleDigits.put("4", "four");
    singleDigits.put("5", "five");
    singleDigits.put("6", "six");
    singleDigits.put("7", "seven");
    singleDigits.put("8", "eight");
    singleDigits.put("9", "nine");

    // HashMap<Integer, String> doubleDigits = new HashMap<Integer, String>();
    // doubleDigits.put(11, "eleven");
    Integer number = Integer.parseInt(inputNumber);

    char[] numberString = inputNumber.toCharArray();

    String finalNumber = new String();

    if (number < 10) {
      finalNumber = singleDigits.get(inputNumber);
    } else {

    }
    return finalNumber;
  }
}
