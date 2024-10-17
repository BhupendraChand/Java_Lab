
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Program5 implements ActionListener {

    JFrame frame;
    JLabel l1,l2,l3,l4;
    JTextField f1,f2,f3;
    JButton btn;
    
    @Override
     public void actionPerformed(ActionEvent e)
    {
        try{
            float p = Float.parseFloat(f1.getText());
            float t = Float.parseFloat(f2.getText());
            float r = Float.parseFloat(f3.getText());
            float result = (p*t*r)/100;
            l4.setText("Result : "+result);
        }catch(NumberFormatException ex)
        {
            l4.setText("Invalid Input !!");
        }

    }

    public Program5()
    {
        frame = new JFrame("Simple Interest Calculator");
        l1 = new JLabel("Enter Principal : ");
        l2 = new JLabel("Enter Time : ");
        l3 = new JLabel("Enter Rate : ");
        l4 = new JLabel();
        
        f1 = new JTextField();
        f2 = new JTextField();
        f3 = new JTextField();
        btn = new JButton("Calculate");
        
        frame.setVisible(true);
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4,2,20,30));
        frame.add(l1);
        frame.add(f1);
        frame.add(l2);
        frame.add(f2);
        frame.add(l3);
        frame.add(f3);
        frame.add(l4);
        frame.add(btn);
        btn.addActionListener(this);
        
    }
    


    public static void main(String[] args) {
        new Program5();

    }


}
