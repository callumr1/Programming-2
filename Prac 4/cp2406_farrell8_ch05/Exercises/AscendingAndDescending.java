package Exercises;

import javax.swing.*;
import java.util.Arrays;

public class AscendingAndDescending {

    public static void main(String args[])
    {
        int[] userArray;
        userArray = new int[3];
        String userInputString;
        int userInput;
        int x = 0;

        while (x < 3)
        {
            userInputString = JOptionPane.showInputDialog(null,"Enter a number");
            userInput = Integer.parseInt(userInputString);
            userArray[x] = userInput;
            x = x + 1;
        }
        System.out.println("Sorting your input in Ascending and Descending order:");
        System.out.println("Ascending Order: ");
        for (int i = 0; i < userArray.length; i++)
            System.out.println(userArray[i] + " ");
        System.out.println("Descending Order: ");
        for (int i = userArray.length - 1; i >= 0; i--)
            System.out.println(userArray[i] + " ");
    }
}
