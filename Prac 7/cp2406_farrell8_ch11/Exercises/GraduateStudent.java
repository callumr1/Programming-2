package Exercises;

public class GraduateStudent extends Student{

    GraduateStudent(int ID, String surname)
    {
        super(ID, surname);
        setStudentAnnualTuition();
    }

    public void setStudentAnnualTuition()
    {
        super.studentAnnualTuition = 6000;
    }
}
