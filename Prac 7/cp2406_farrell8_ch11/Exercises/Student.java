package Exercises;

public abstract class Student {
    private int studentID;
    private String studentSurname;
    int studentAnnualTuition;
    
    Student(int ID, String surname)
    {
        this.studentID = ID;
        this.studentSurname = surname;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentAnnualTuition() {
        return studentAnnualTuition;
    }

    public abstract void setStudentAnnualTuition();

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    @Override
    public String toString(){
        return("Student ID: " + this.getStudentID()+
        "\nStudent Lastname: "+ this.getStudentSurname() +
        "\nStudent Annual Tuition: "+ this.getStudentAnnualTuition());
    }
}
