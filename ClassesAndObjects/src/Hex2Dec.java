

import java.util.Scanner;

//The remaining checkstyle errors that i have were all related to JAVADOC related problems. Seeing as this is not of import
//I neglected to fix them
public class Hex2Dec {


    public static void main(final String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        Hex2Dec converter = new Hex2Dec();


        MyTests test = new MyTests();
        //  test.hex2decTest();

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number "
                + hex + " is " + converter.hexToDecimal(hex.toUpperCase()));
    }

    public int hexToDecimal(final String hex) {
        final int sixteen = 16;
        int decimalValue = 0;
        final String hex2 = hex.toUpperCase();
        for (int i = 0; i < hex2.length(); i++) {
            char hexChar = hex2.charAt(i);
            decimalValue = decimalValue * sixteen + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public int hexCharToDecimal(final char ch) {
        final int ten = 10;
        if ('A' <= ch && ch <= 'F') {
            return ten + ch - 'A';
        } else { // ch is '0', '1', ..., or '9'
            return ch - '0';
        }
    }
}
