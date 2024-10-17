import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Program4 implements ActionListener
{
    JFrame frame;
    JButton btn1,btn2;
    JLabel label1,label2;
    JTextField t1,t2,t3;
    public Program4()
    {
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        t3 = new JTextField(30);
        btn1 = new JButton("Find");
        label1 = new JLabel("Enter L : ");
        label2 = new JLabel("Enter B : ");
        frame = new JFrame("Area and Primeter");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        btn1.addActionListener(this);
        frame.setLayout(new FlowLayout());
        frame.add(label1);
        frame.add(t1);
        frame.add(label2);
        frame.add(t2);
        frame.add(btn1);
        frame.add(t3);      
    }

    @Override
    public void actionPerformed(ActionEvent ex)
    {
        float l = Float.parseFloat(t1.getText());
        float b = Float.parseFloat(t2.getText());
        float area = l*b;
        float perimeter = 2*(l+b);
        t3.setText("Area : "+area+", Perimeter : "+perimeter);

    }
    public static void main(String [] args)
    {
        new Program4();
    }
}