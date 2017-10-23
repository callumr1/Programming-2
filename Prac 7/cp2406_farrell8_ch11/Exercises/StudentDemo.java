package Exercises;

import javax.swing.*;

public class StudentDemo {

    private static Student[] studentArray = new Student[6];

    public static void main(String[] args)
    {
        buildArray();
        displayArray();
    }

    private static void buildArray()
    {
        studentArray[0] = new UndergraduateStudent(1, "Stevens");
        studentArray[1] = new UndergraduateStudent(2, "Doe");
        studentArray[2] = new GraduateStudent(3, "Robertson");
        studentArray[3] = new GraduateStudent(4, "Daniels");
        studentArray[4] = new StudentAtLarge(5, "Simpson");
        studentArray[5] = new StudentAtLarge(6, "Floyd");
    }

    private static void displayArray()
    {
        for(int x = 0; x < studentArray.length; ++x)
            JOptionPane.showMessageDialog(null, studentArray[x].toString());
    }
}
