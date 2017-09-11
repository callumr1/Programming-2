package ProgrammingExercises;

import java.util.Scanner;

public class InputGrades {

    private static int studentID;
    private static String courseID;
    public static char grade;


    public static void main(String args[])
    {
        int studentCount;
        int courseCount;
        String correctGrades = "A B C D E F";
        CharSequence gradeInput;
        boolean isCorrectGrade = false;
        for(studentCount = 1; studentCount <= 10; studentCount++)
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter ID for student #" + studentCount + ">>> ");
            studentID = s.nextInt();


            for (courseCount = 1; courseCount <= 5; courseCount++)
            {
                Scanner c = new Scanner(System.in);
                System.out.print("Enter course ID #" + courseCount + ">>> ");
                courseID = c.nextLine();

                Scanner g = new Scanner(System.in);
                System.out.print("Enter the grade for Student: " + studentCount + " and Course " + courseID + ">>> ");
                gradeInput = g.nextLine();
                while (!isCorrectGrade)
                {
                    if (correctGrades.contains(gradeInput))
                    {
                        grade = g.nextLine().charAt(0);
                        isCorrectGrade = true;
                    }
                    else
                    {
                        System.out.print("Please enter a Grade from the following: (A B C D E F) >>> ");
                        gradeInput = g.nextLine();
                    }

                }
                System.out.println("Student: " + studentID + " received the following grades:");
                System.out.println("For Course " + courseID + " the student received a " + grade);

            }
        }
    }
}
