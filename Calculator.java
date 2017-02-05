import java.util.*;

public class Calculator {


  private static double getDouble() {

    double number = 0;
    String input;
    boolean error;
    do {
      error = false;
      input = System.console().readLine();
      try {
        number = Double.parseDouble(input);
      } catch(NumberFormatException nfe) {
        System.out.println("Make sure your answer is a number.");
        error = true;
      }
    } while (error == true);
    return number;

  }

  public static void main(String[] args) {

    System.out.println("Pick any number.");
    double number1 = getDouble();
    System.out.println("Pick another number.");
    double number2 = getDouble();
    String input;
    boolean error = false;

/*
*/

    int selectedOperation = -1;
    System.out.println("Type '1' if you would like to add, '2' if you would like to subtract, '3' if you would like to multiply, or '4' if you would like to divide.");
    while (selectedOperation < 1 || selectedOperation > 4) {
      input = System.console().readLine();
      try {
        selectedOperation = Integer.parseInt(input);
      } catch(NumberFormatException nfe) {
        System.out.println("Make sure your answer is either 1, 2, 3, or 4.");
        error = true;
      }
    }
    double solution;
    switch (selectedOperation) {
      case 1: solution = number1 + number2;
              break;
      case 2: solution = number1 - number2;
              break;
      case 3: solution = number1 * number2;
              break;
      default: solution = number1 / number2;
              break;
    }

    if ( ((double) (int) solution) == solution) {
      System.out.println("Your solution is " + (int)solution);
    }
    else {
      System.out.println("Your solution is " + solution);
    }

  }
}
