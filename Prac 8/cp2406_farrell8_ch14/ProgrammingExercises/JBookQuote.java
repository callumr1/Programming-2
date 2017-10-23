import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JBookQuote extends JFrame implements ActionListener{

    private JLabel bookQuote = new JLabel("You're a Wizard Harry");

    private JButton showBookQuote = new JButton("Book Quote");

    private JBookQuote(){
        super("Book Quote");
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(showBookQuote);
        add(bookQuote);
        showBookQuote.addActionListener(this);
        bookQuote.setVisible(false);
    }

    public static void main(String args[]){
        JBookQuote frame = new JBookQuote();
        frame.setSize(200,150);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if(source == showBookQuote)
        {
            bookQuote.setVisible(true);
            repaint();
        }
    }
}
