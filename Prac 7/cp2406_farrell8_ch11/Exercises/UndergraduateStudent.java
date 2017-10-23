package Exercises;

public class UndergraduateStudent extends Student
{

    UndergraduateStudent(int ID, String surname)
    {
        super(ID, surname);
        setStudentAnnualTuition();
    }

    public void setStudentAnnualTuition()
    {
        super.studentAnnualTuition = 4000;
    }

}
