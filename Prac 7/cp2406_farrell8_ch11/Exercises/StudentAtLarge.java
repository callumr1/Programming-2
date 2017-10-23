package Exercises;

public class StudentAtLarge extends Student {

    StudentAtLarge(int ID, String surname)
    {
        super(ID, surname);
        setStudentAnnualTuition();
    }

    public void setStudentAnnualTuition()
    {
        super.studentAnnualTuition = 2000;
    }
}
