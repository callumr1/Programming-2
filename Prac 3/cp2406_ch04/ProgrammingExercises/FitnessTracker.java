package cp2406_ch04.ProgrammingExercises;

public class FitnessTracker {
    private String activity;
    private int minutes;
    private String date;

    public FitnessTracker()
    {
        activity = "Running";
        minutes = 0;
        date = "01/01/2017";
    }

    public FitnessTracker(String activity, int minutes, String date)
    {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }

    public void showData()
    {
        System.out.println("Activity: " + activity + " Time: " + minutes + " Date: " + date);
    }
}
