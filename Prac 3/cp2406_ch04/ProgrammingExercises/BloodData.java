package cp2406_ch04.ProgrammingExercises;

public class BloodData
{
    private String bloodType ;
    private String rhFactor;

    public BloodData()
    {
        bloodType = "O";
        rhFactor = "+";
    }

    public BloodData(String bloodType, String rhFactor)
    {
        if (bloodType.equals("O") || bloodType.equals("A")  || bloodType == "B" || bloodType == "AB")
            this.bloodType = "O";
        else
            this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

}
