/* This program prints the max run of a string
*
* @author  Hussein
* @version 1.0
* @since 2020-11-30
*/

import java.util.Scanner;

/**
* This is the standard "maxRun" program.
*/

final class MaxRun {

    /**
    * Declaring exponent variable.
    */
    public static final String SPACE = "\n";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private MaxRun() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting the reverse Method.
    *
    * @param str the string.
    * @return maxRun what we returned.
    */
    public static int maxRun(CharSequence str) {
        final int ret;
        if (str.length() == 0) {
            ret = 0;
        }

        int maxRun = 1;
        int currentRun = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentRun++;
                if (currentRun > maxRun) {
                    maxRun = currentRun;
                }
            } else {
                currentRun = 1;
            }
        }
        return maxRun;
    }

    /**
    * Starting the main Method.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        // Create a Scanner object
        final Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a String: ");
        // Read user input
        final String input = myObj.nextLine();
        // input error catcher
        try {
            if (true) {
                Integer.parseInt(input);
                System.out.println(SPACE + "Error : Invalid Input!");
            }
        } catch (NumberFormatException ex) {
            System.out.print(SPACE
                             + "The Max Run (number of multiple letters): "
                             + maxRun(input)
                             + SPACE);
        }
        // print Done.
        System.out.println(SPACE + "Done.");
    }
}
