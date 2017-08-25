package cp2406_ch04.ProgrammingExercises;

public class TestFitnessTracker {

    public static void main(String args[])
    {
        String activity = "Swimming",
                date = "02/01/2017";
        int minutes = 30;

        FitnessTracker a1 = new FitnessTracker();
        FitnessTracker a2 = new FitnessTracker(activity, minutes, date);
        a1.showData();
        a2.showData();
    }


}
