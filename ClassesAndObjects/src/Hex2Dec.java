import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Scanner;

public class Hex2Dec {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    Hex2Dec converter= new Hex2Dec();

    Result result= JUnitCore.runClasses(MyTests.class);

    for(Failure failure:result.getFailures()){


      System.out.println(failure.toString());
    }


    MyTests test = new MyTests();
  //  test.hex2decTest();

    // Prompt the user to enter a string
    System.out.print("Enter a hex number: ");
    String hex = input.nextLine();

    System.out.println("The decimal value for hex number "
      + hex + " is " + converter.hexToDecimal(hex.toUpperCase()));
  }

  public  int hexToDecimal(String hex) {
    int decimalValue = 0;
    hex=hex.toUpperCase();
    for (int i = 0; i < hex.length(); i++) {
      char hexChar = hex.charAt(i);
      decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
    }
    
    return decimalValue;
  }

  public int hexCharToDecimal(char ch) {
    if ('A' <= ch && ch <= 'F')
      return 10 + ch - 'A';
    else // ch is '0', '1', ..., or '9'
      return ch - '0';
  }
}
