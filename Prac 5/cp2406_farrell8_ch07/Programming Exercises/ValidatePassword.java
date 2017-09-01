import jdk.internal.util.xml.impl.Input;

import javax.swing.*;
import java.util.Scanner;

public class ValidatePassword {

    public static void main(String args[])
    {
        boolean passwordIsValid = false;
        String password;

        while (!passwordIsValid)
        {
            int capitalCount = 0;
            int lowerCount = 0;
            int numCount = 0;
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter your password >>> ");
            password = in.nextLine();
            for (int i = 0; i < password.length(); i++)
            {

                char aChar = password.charAt(i);
                if (Character.isUpperCase(aChar))
                    capitalCount += 1;
                if (Character.isLowerCase(aChar))
                    lowerCount += 1;
                if (Character.isDigit(aChar))
                    numCount +=1;

            }
            if (capitalCount >= 2 && lowerCount >= 2 && numCount >= 2)
            {
                passwordIsValid = true;
                System.out.println("Your password is acceptable");
            }
            if (capitalCount < 2)
            {
                System.out.println("Your password does not have at least Capital Letters");
                passwordIsValid = false;
            }
            if (lowerCount < 2)
            {
                System.out.println("Your password does not have at least 2 Lower Case Letters");
                passwordIsValid = false;
            }
            if (numCount < 2)
            {
                System.out.println("Your password does not have at least 2 Numbers");
                passwordIsValid = false;
            }

        }

    }
}
