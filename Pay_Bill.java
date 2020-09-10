
package Electricity;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pay_Bill extends JFrame
{
    Pay_Bill()
    {
        super("PAY YOUR BILL");
        
        JEditorPane j=new JEditorPane();
        j.setEditable(false);
        
        try
        {
           j.setPage("https://paytm.com/electrcity-bil-payment");
           
        }
        catch(Exception e)
                {
                   j.setContentType("text/html");
                   j.setText("<html><b><i><center>Could Not Load<center></i></b></html>");
                }
        JScrollPane sp=new JScrollPane(j);
        add(sp);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800,600));
        setSize(800,800);
        setLocation(250,120);
        setVisible(true);
     
         
    }
    public static void main(String[]args)
    {
        new Pay_Bill().setVisible(true); 
    }
}
