package cp2406_farrell8_ch06.Exercises;

import javax.swing.*;

public class CountByAnything {

    public static void main(String args[])
    {
        int MIN = 3;
        int MAX = 300;
        int countBy;
        int enterBy = 10;
        String countByString;

        countByString = JOptionPane.showInputDialog("What would you like to count by? ");
        countBy = Integer.parseInt(countByString);

        for (int x = 0; x <= 10; x++)
            for (int i = MIN; i <= MAX; i = i + countBy)
                if (x == 10)
                    System.out.print(i + "\n");
                else
                    System.out.print(i + " ");
    }
}
