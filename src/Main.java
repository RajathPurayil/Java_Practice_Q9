import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Write a program that converts pounds into kilograms.
        The program prompts the user to enter a number in pounds, converts it
        to kilograms, and displays the result. One pound is 0.454 kilograms.
                */


        // Creating Scanner object

        Scanner sc = new Scanner(System.in);
        final double KILOGRAMS_PER_POUND = 0.454;

        // Prompt input from the  user

        System.out.println("Enter the pound Value");
         double pound = sc.nextDouble();

        // Converting pound into Kg

         double kg = pound*KILOGRAMS_PER_POUND;

        // Display Output


        System.out.println("Value in KG "+kg);








    }
}