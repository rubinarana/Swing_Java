/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI {
    public static void main(String[] args) 
    {
        Abc obj=new Abc();
      
    }
    
}
class Abc extends JFrame //cardlayout by default
{
    public Abc()
    {
    
        JLabel l=new JLabel("hello"); //to show somthing 
        JLabel ll=new JLabel("world");
        
        add(l);
        add(ll);
        
        setLayout(new FlowLayout());
        setVisible(true); //for visiblilty
        setSize(400,400); //set size width and height
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }   
}
