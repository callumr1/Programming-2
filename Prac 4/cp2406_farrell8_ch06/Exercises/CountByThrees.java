package cp2406_farrell8_ch06.Exercises;

public class CountByThrees {

    public static void main(String args[])
    {
        int MIN = 3;
        int MAX = 300;
        int countBy = 3;

        for (int i = MIN; i <= MAX; i = i + countBy)
            if ((i % 30) == 0)
                System.out.print(i + "\n");

            else
                System.out.print(i + " ");


    }
}
