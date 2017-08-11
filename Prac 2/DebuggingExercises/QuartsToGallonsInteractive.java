import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {

    public static void main(String[] args)
    {
        int quarts = 4;
        int quartsOfPaint;
        String paintRequired;


        paintRequired = JOptionPane.showInputDialog(null,"How many quarts of paint is required?",
                "Paint", JOptionPane.INFORMATION_MESSAGE);

        quartsOfPaint = Integer.parseInt(paintRequired);
        int gallonsNeeded = quartsOfPaint/quarts;
        int quartsNeeded = quartsOfPaint%quarts;

        JOptionPane.showMessageDialog(null,"A job that needs " + quartsOfPaint + " quarts requires "
                + gallonsNeeded + " gallons and " + quartsNeeded + " quarts");
    }


}
