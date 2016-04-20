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

    HashMap<String, String> teens = new HashMap<String, String>();
    teens.put("11", "eleven");
    teens.put("12", "twelve");
    teens.put("13", "thirteen");
    teens.put("14", "fourteen");
    teens.put("15", "fifteen");
    teens.put("16", "sixteen");
    teens.put("17", "seventeen");
    teens.put("18", "eighteen");
    teens.put("19", "nineteen");

    HashMap<String, String> doubleDigits = new HashMap<String, String>();
    doubleDigits.put("2", "twenty");
    doubleDigits.put("3", "thirty");
    doubleDigits.put("4", "forty");
    doubleDigits.put("5", "fifty");
    doubleDigits.put("6", "sixty");
    doubleDigits.put("7", "seventy");
    doubleDigits.put("8", "eighty");
    doubleDigits.put("9", "ninety");

    HashMap<String, String> tripleDigits = new HashMap<String, String>();
    tripleDigits.put("1", "one hundred");
    tripleDigits.put("2", "two hundred");
    tripleDigits.put("3", "three hundred");
    tripleDigits.put("4", "four hundred");
    tripleDigits.put("5", "five hundred");
    tripleDigits.put("6", "six hundred");
    tripleDigits.put("7", "seven hundred");
    tripleDigits.put("8", "eight hundred");
    tripleDigits.put("9", "nine hundred");

    Integer number = Integer.parseInt(inputNumber);
    char[] numberString = inputNumber.toCharArray();
    String finalNumber = new String();

    String singleDig = singleDigits.get(Character.toString(numberString[0]));
    String doubleDig = doubleDigits.get(Character.toString(numberString[0]));
    String tripleDig = tripleDigits.get(Character.toString(numberString[0]));

    if ( number < 10 ) {
      finalNumber = singleDigits.get(inputNumber);
    } else if ( number > 10 && number < 20 ) {
      finalNumber = teens.get(inputNumber);
    } else if ( number > 19 && number < 100 ) {
      finalNumber = doubleDigits.get(Character.toString(numberString[0])) + " " + singleDigits.get(Character.toString(numberString[1]));
    } else if ( number > 99 && number < 1000 ) {
      finalNumber = tripleDigits.get(Character.toString(numberString[0])) + " " + doubleDigits.get(Character.toString(numberString[1])) + " " + singleDigits.get(Character.toString(numberString[2]));
    } else {
    return finalNumber;
  }
}
