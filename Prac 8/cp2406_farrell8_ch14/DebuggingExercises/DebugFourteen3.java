// User selects pizza topping and sees price
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DebugFourteen3 extends JFrame implements ItemListener
{
   private JComboBox<String> pizzaBox = new JComboBox<>();
   private JTextField totPrice = new JTextField(10);
   private int[] pizzaPrice = {7, 10, 10, 8, 8, 8, 8};
   int pizzaNum;
   private DebugFourteen3()
   {
      super("Pizza List");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      FlowLayout flow = new FlowLayout();
      setLayout(flow);
      pizzaBox.addItemListener(this);
      JLabel toppingList = new JLabel("Topping List");
      add(toppingList);
      pizzaBox.addItem("cheese");
      pizzaBox.addItem("sausage");
      pizzaBox.addItem("pepperoni");
      pizzaBox.addItem("onion");
      pizzaBox.addItem("green pepper");
      pizzaBox.addItem("green olive");
      pizzaBox.addItem("black olive");
      add(pizzaBox);
      JLabel aLabel = new JLabel("Paulos's American Pie");
      add(aLabel);
   }
   public static void main(String[] arguments)
   {
      JFrame frame = new DebugFourteen3();
      frame.setSize(200, 150);
      frame.setVisible(true);
   }

   @Override
   public void itemStateChanged(ItemEvent list)
   {
     Object source = list.getSource();
     if(source == pizzaBox)
     {
        int pizzaNum = pizzaBox.getSelectedIndex();
        int totalPrice = pizzaPrice[pizzaNum];
        String output = "Pizza Price $" + totalPrice;
        totPrice.setText(output);
     }
   }
}