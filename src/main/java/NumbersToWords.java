import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class NumbersToWords {
  public static void main(String[] args) {

  }

  public static String turnNumbersToWords(String inputNumber) {
    char[] numberArray = inputNumber.toCharArray();
    Integer[] integerArray = parseInt(numberArray);
    ArrayList<String> wordArray = new ArrayList<String>();
    HashMap<Integer, String> numberList = new HashMap<Integer, String>();
    numberList.put(1, "one");

    for (Integer digit : integerArray) {
      String finalWords = numberList.get(digit);
      wordArray.add(finalWords);
      return wordArray;
    }
  }
}
