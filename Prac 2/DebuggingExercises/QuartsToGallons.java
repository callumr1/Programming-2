public class QuartsToGallons {

    public static void main(String[] args)
    {
        int quarts = 4;
        int quartsOfPaint = 18;
        int gallonsNeeded = quartsOfPaint/quarts;
        int quartsNeeded = quartsOfPaint%quarts;

        System.out.println("A job that needs " + quartsOfPaint + " quarts requires " + gallonsNeeded + " gallons and "
                + quartsNeeded + " quarts");

    }
}
