// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DebugFifteen2 extends JFrame
{
   private JButton nb = new JButton("Left    ");
   private JButton sb = new JButton("Down  ");
   private JButton eb = new JButton("Right ");
   private JButton wb = new JButton("Center  ");
   private JButton cb = new JButton("Up");
   Container con = null;

   public DebugFifteen2()
   {
      con = this.getContentPane();
      con.setLayout(new BorderLayout());
      con.add(nb);
      con.add(sb);
      con.add(eb);
      con.add(wb);
      con.add(cb);
   }
   public static void main(String[] args)
   {
      DebugFifteen2 f = new DebugFifteen2();
      f.setSize(300, 300);
      f.setVisible(true);
   }
}