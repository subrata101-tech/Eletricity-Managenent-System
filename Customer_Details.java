
package Electricity;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Customer_Details extends JFrame implements ActionListener
        
{
    JTable t1;
    JButton b1;
    String x[]={"Cus Name","Meter No","Address","State","City","Email","Phone","User Name","Password"};
    String y[][]=new String[200][10];
    
    int i=0,j=0;
    
    Customer_Details()
    {
        super("CUSTOMER DETAILS");  
        
        
        setLocation(200,200);
        setSize(1200,650);
        
        try
        {
          Conn c1=new Conn();
          String q1="select * from emp";
          ResultSet rs=c1.s.executeQuery(q1);
          
          while(rs.next())
          {
              y[i][j++]=rs.getString("name");
              y[i][j++]=rs.getString("meter_number");
              y[i][j++]=rs.getString("address");
              y[i][j++]=rs.getString("state");
              y[i][j++]=rs.getString("city");
              y[i][j++]=rs.getString("email");
              y[i][j++]=rs.getString("phone");
           
              y[i][j++]=rs.getString("username");
             
              y[i][j++]=rs.getString("password");
              
              
              i++;
              j=0;
                           
          }
          
          t1=new JTable(y,x);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        b1=new JButton("PRINT");
        add(b1,"South");
        
        JScrollPane sp=new JScrollPane(t1);
        add(sp);
        
        b1.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            t1.print();
            
        }
        catch(Exception e)
        {
            
        }
    }
    
    public static void main(String[]args)
    {
        new Customer_Details().setVisible(true);
    }
           
}

