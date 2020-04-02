package swingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Information {
    public static void main(String[] args) 
    {
                Detail obj=new Detail();
    }
    
}

class Detail extends JFrame implements ActionListener 
{
     JLabel l1,l2,l3,l4,l5,l6;
     JTextArea t1,t2,t3,t4,t5;
     JButton b1,b2,b3;
     
     public Detail()
     {
         l1=new JLabel(("ID:")); 
         l1.setBounds(60,20,70,50);     //x , y , width , height
         t1=new JTextArea();
         t1.setBounds(130,35,100,20);
         
         l2=new JLabel(("NAME:")); 
         l2.setBounds(60,50,70,50);
         t2=new JTextArea();
         t2.setBounds(130,65,100,20);
         
         l3=new JLabel(("AGE:")); 
         l3.setBounds(60,80,70,50);
         t3=new JTextArea();
         t3.setBounds(130,95,100,20);
         
         l4=new JLabel(("ADDRESS:")); 
         l4.setBounds(60,110,70,50);
         t4=new JTextArea();
         t4.setBounds(130,125,100,20);
         
         l6=new JLabel(("CONTACT:")); 
         l6.setBounds(60,140,70,50);
         t5=new JTextArea();
         t5.setBounds(130,155,100,20);
         
         b1=new JButton("INSERT");
         b1.setBounds(20,200,95,40);
         b1.addActionListener(this);
         
         b2=new JButton("DELETE");
         b2.setBounds(120,200,95,40);
         b2.addActionListener(this);
         
         b3=new JButton("UPDATE");
         b3.setBounds(220,200,95,40);
          b3.addActionListener(this);
         
         l5=new JLabel("");
         l5.setBounds(70,210,200,200);
         
        add(l1);    add(t1);
        add(l2);    add(t2);
        add(l3);    add(t3);
        add(l4);    add(t4);
        add(l6);    add(t5);
        add(l5);
        add(b1);
        add(b2);
        add(b3);
        
        b1.addActionListener(this); 
        b2.addActionListener(this); 
        b3.addActionListener(this);
        
         setLayout(null);
         setVisible(true); //for visiblilty
         setSize(350, 350); //set size width and height
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
     }
           public void actionPerformed(ActionEvent ae)  //method of actionlistener, actionlisterer will call actionPerformed
    {
               String s1=t1.getText(); //id
               String s2=t2.getText();//name
               String s3=t1.getText(); //age
               String s4=t1.getText();//address
    }

 