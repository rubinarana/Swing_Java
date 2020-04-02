package swingdemo;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calc {
    public static void main(String[] args) 
    {
        AddSub obj=new AddSub();
    }
}

class AddSub extends JFrame implements ActionListener 
{
     JTextField t1,t2;
     JButton b1;
     JButton b2;
     JLabel l;
    public AddSub()
    {
         t1=new JTextField(20); //20 is size
         t2=new JTextField(20);
         b1=new JButton("ADD");
         b2=new JButton("SUB");
         l=new JLabel("result");
        
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);
        
        b1.addActionListener(this); 
        b2.addActionListener(this); 
         
        setLayout(new FlowLayout()); //using flowlayout setBounds ins not needed
        setVisible(true); //for visiblilty
        setSize(400, 400); //set size width and height
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent ae)  //method of actionlistener, actionlisterer will call actionPerformed
    {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int value=0;
            if(ae.getSource()==b1)
                 value=num1+num2;
            else
                value=num1-num2;
            l.setText(Integer.toString(value));

           // l.setText(value + "");//string+integer= string
    }
}
