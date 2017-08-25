package cp2406_farrell8_ch06.Exercises;
import java.util.Scanner;
public class CountByAnything {

    public static void main(String args[])
    {
        int MAX = 300;
        int countBy;
        int numberPerLine;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What would you like to count by? ");
        countBy = keyboard.nextInt();
        numberPerLine = countBy * 10;

        for (int i = countBy; i <= MAX; i = i + countBy)
        {
            System.out.print(i + " ");
            if (i % numberPerLine == 0)
                System.out.println();

        }
    }
}
