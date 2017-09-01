package ProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TwelveInts {

    public static void main(String args[])
    {
        Integer numbers[] = new Integer[12];
        int num;
        String userInput;

        for (int i = 0; i < 12; i++)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter an integer >>> ");
            userInput = in.nextLine();
            num = Integer.parseInt(userInput);
            numbers[i] = num;
        }

        System.out.println("The numbers in ascending order are: ");
        for(int i = 0; i < 12; i++)
        {
            Arrays.sort(numbers);
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("\nThe numbers in descending order are: ");
        for(int i = 0; i < 12; i++)
        {
            Arrays.sort(numbers, Collections.reverseOrder());
            System.out.print(numbers[i] + " ");
        }
    }
}
