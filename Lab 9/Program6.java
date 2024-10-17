
import javax.swing.*;
import java.awt.event.*;

public class Program6 implements ActionListener {

    JFrame frame;
    JLabel label1, label2, label3, label4, label5, label6, label7;
    JTextField tf1, tf2, tf3;
    JTextArea ta;
    JRadioButton radio1, radio2;
    JCheckBox check1, check2, check3;
    JComboBox cb;
    ButtonGroup bg;
    JButton save;

    public Program6() {
        frame = new JFrame("Student Information Form");
        frame.setSize(600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Student Information");
        label2 = new JLabel("Roll");
        label3 = new JLabel("Name");
        label4 = new JLabel("College");
        label5 = new JLabel("Gender");
        label6 = new JLabel("Hobbies");
        label7 = new JLabel("Program");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        ta = new JTextArea();

        radio1 = new JRadioButton("Male");
        radio2 = new JRadioButton("Female");
        bg = new ButtonGroup();
        bg.add(radio1);
        bg.add(radio2);

        check1 = new JCheckBox("Playing");
        check2 = new JCheckBox("Reading");
        check3 = new JCheckBox("Swimming");

        String[] opts = new String[]{
            "BCA", "BSc. CSIT", "BIT", "BICT"
        };
        
        cb = new JComboBox(opts);
        save = new JButton("Save");
        
        frame.setLayout(null);
        label1.setBounds(140,10,160,50);
        label2.setBounds(10,80,80,30);
        label3.setBounds(10,110,80,30);
        label4.setBounds(10,140,80,30);
        label5.setBounds(10,170,80,30);
        label6.setBounds(10,200,80,30);
        label7.setBounds(10,230,80,30);
        
        tf1.setBounds(80,80,100,30);
        tf2.setBounds(80,110,100,30);
        tf3.setBounds(80,140,100,30);
        
        radio1.setBounds(80,170,60,30);
        radio2.setBounds(140,170,80,30);
        
        check1.setBounds(80,200,80,30);
        check2.setBounds(160,200,80,30);
        check3.setBounds(240,200,100,30);
        
        cb.setBounds(100,230,80,30);
        ta.setBounds(400,80,200,200);
        save.setBounds(200,280,150,80);
        
        
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(radio1);
        frame.add(radio2);
        frame.add(check1);
        frame.add(check2);
        frame.add(check3);
        frame.add(cb);
        frame.add(save);
        save.addActionListener(this);
        
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ex)
    {
        frame.add(ta);
        int roll = Integer.parseInt(tf1.getText());
        String name = tf2.getText();
        String college = tf3.getText();
        String gender;
        StringBuffer hobbies = new StringBuffer();
        if(radio1.isSelected())
        {
            gender = "Male";
        }else if(radio2.isSelected()){
            gender = "Female";
        }else{
            gender = "Not selected !!";
        }
        
        if(check1.isSelected())
        {
            hobbies.append(check1.getText()+", ");
        }
        if(check2.isSelected())
        {
            hobbies.append(check2.getText()+", ");
        }
        if(check3.isSelected())
        {
            hobbies.append(check3.getText());
        }
        String program = cb.getSelectedItem().toString();
         String result = "Roll : "+roll+"\nName : "+name+"\nCollege : "+college+"\nGender : "+gender+"\nHobbies : "+hobbies+"\nProgram : "+program;
        ta.setText(result);
    }

    public static void main(String[] args) {
        new Program6();
    }
}
