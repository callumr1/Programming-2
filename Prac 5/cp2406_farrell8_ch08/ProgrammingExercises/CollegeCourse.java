package ProgrammingExercises;

public class CollegeCourse {
    private String courseID;
    private int creditHours;
    private char grade;

    public CollegeCourse()
    {
        courseID = "CIS 210";
        creditHours = 3;
        grade = 'A';
    }

    public String getCourseID()
    {
        //getting the courseID variable
        return courseID;
    }

    public void setCourseID(String courseID)
    {
        //setting the courseID variable value
        this.courseID = courseID;
    }

    public int getCreditHours()
    {
        //getting the creditHours variable
        return creditHours;
    }

    public void setCreditHours(int creditHours)
    {
        //setting the creditHours variable value
        this.creditHours = creditHours;
    }

    public char getGrade()
    {
        //getting the grade vaariable
        return grade;
    }

    public void setGrade(char grade)
    {
        //setting the grade variable value
        this.grade = grade;
    }
}
