package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;

public class AddGUI {
    public static void main(String[] args) 
    {
        Addition obj=new Addition();
    }
    
}
class Addition extends JFrame implements ActionListener // creating obj of addition create obj. of actionlistener(since obj. of action listerner our class need to imp. actionlistener)
{
     JTextField t1,t2;
     JButton b;
     JLabel l;
    public Addition()
    {
        /*JTextField*/ t1=new JTextField(20); //20 is size
        /*JTextField*/ t2=new JTextField(20);
        /*JButton*/ b=new JButton("OK");
        /*JLabel*/ l=new JLabel("result");
        
        add(t1);
        add(t2);
        add(b);
        add(l);
        
        b.addActionListener(this); //interface
        //since b is dumb, this is obj. of addition and ActionListener
         

        setLayout(new FlowLayout());
        setVisible(true); //for visiblilty
        setSize(400, 400); //set size width and height
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent ae)  //method of actionlistener, actionlisterer will call actionPerformed
    {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            
            int value=num1+num2;
            l.setText(value + "");//string+integer= string
    }
}

        /* b.addActionListener(ae-> {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            
            int value=num1+num2;
            l.setText(value + "");//string+integer= string
    }*/