package ProgrammingExercises;

public class Student {

    private int studentID;
    private String collegeCourses[] = new String[5];
    int num = 0;
    String courseID;

    public int getStudentID()
    {
        return studentID;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    public String getCollegeCourses(int num)
    {
        //takes an integer, and returns the ID of the college course at that index in the array
        courseID = collegeCourses[num];
        return courseID;
    }

    public void setCollegeCourses(String courseID, int num)
    {
        //sets the courseID at index, num, in the collegeCourses array
        collegeCourses[num] = courseID;
        this.collegeCourses = collegeCourses;
    }
}
