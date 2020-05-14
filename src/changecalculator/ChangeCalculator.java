package changecalculator;

import java.util.Scanner;

/**
 * This Class takes in user input, and outputs change amount
 *
 * @author Mark Carreira
 */
public class ChangeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the change calculator!");
        System.out.println("Please enter an amount of money to calculate change for.");

        //Find dollar value
        double amount = input.nextDouble();
        int remainingAmount = (int) (amount * 100);

        //Convert for dollar value
        int loonies = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //Convert for quarters
        int quarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        //Convert for dimes
        int dimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        //Convert for nickels
        int nickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        //Convert for pennies
        int pennies = remainingAmount / 1;
        remainingAmount = remainingAmount % 1;

        //Display results
        System.out.println("Your entered value was : $" + amount);
        System.out.println("Of that, you have " + loonies + " loonies,");
        System.out.println(quarters + " quarters,");
        System.out.println(dimes + " dimes,");
        System.out.println(nickels + " nickels,");
        System.out.println(pennies + " pennies");

    }

}
