
package Electricity;


import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Generate_Bill extends JFrame implements ActionListener
{
    JLabel l1;
    JTextArea t1;
    JButton b1;
    JPanel p1;
    Choice c1,c2;
    
    Generate_Bill()
    {
        super("GENERATE BILL");
        
        setSize(500,500);
        setLayout(new BorderLayout());
        
        p1=new JPanel();
        
        l1=new JLabel("Generate Bill");
        
        c1=new Choice();
        c1.add("1000");
        c1.add("1001");
        c1.add("1002");
        c1.add("1003");
        c1.add("1004");
        c1.add("1005");
        c1.add("1006");
        c1.add("1007");
        c1.add("1008");
        c1.add("1009");
        c1.add("1010");
        
        c2=new Choice();
  
        c2.add("January");
        c2.add("February");
        c2.add("March");
        c2.add("April");
        c2.add("May");
        c2.add("June");
        c2.add("July");
        c2.add("August");
        c2.add("September");
        c2.add("October");
        c2.add("November");
        c2.add("December");
        
        t1=new JTextArea(50,15);
        JScrollPane sp=new JScrollPane(t1);
        t1.setFont(new Font("Senserit",Font.ITALIC,18));
        
        
        b1=new JButton("Generate Bill");
        
        p1.add(l1);
        p1.add(c1);
        p1.add(c2);
        
        add(p1,"North");
        
        add(sp,"Center");
        add(b1,"South");
        
        b1.addActionListener(this);
        
        setLocation(350,40);
        
       
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            Conn co=new Conn();
            String month=c2.getSelectedItem();
            t1.setText("\tReliance Power Limited\nELECRICITY BILL FOR THE MONTH OF "+month+",2020\n\n\n");
            
          /*  String q="select * from emp where meter_number=+co.getSelectedItem";
            ResultSet rs=co.s.executeQuery(q);
           */
            
            ResultSet rs=co.s.executeQuery("select * from emp where meter_number="+c1.getSelectedItem());
            
            if(rs.next())
            {
                t1.append("\n   Customer Name :"+rs.getString("name"));
                t1.append("\n   Meter Number :"+rs.getString("meter_number"));
                t1.append("\n   Address :          "+rs.getString("address"));
                t1.append("\n   State :              "+rs.getString("State"));
                t1.append("\n   City :                 "+rs.getString("city"));
                t1.append("\n   Email :               "+rs.getString("address"));
                t1.append("\n   Phone Number:     "+rs.getString("phone"));
                t1.append("\n---------------------------------------------------------");
                t1.append("\n");

            }
            rs=co.s.executeQuery("select * from tax");
            
            if(rs.next())
            {
                t1.append("\n   Meter Location:"+rs.getString("meter_location"));
                t1.append("\n   Meter Type:         "+rs.getString("meter_type"));
                t1.append("\n   Meter Code:              "+rs.getString("meter_code"));
                t1.append("\n   Phase Code:         "+rs.getString("phase_type"));
                t1.append("\n   Bill Type:              "+rs.getString("bill_type"));
                t1.append("\n   Days:                   "+rs.getString("days"));
                t1.append("\n");
                t1.append("-----------------------------------------------------------");
                t1.append("\n\n");
                t1.append("\n   Meter Rent :\t\t" +rs.getString("meter_rent"));
                t1.append("\n   MCB Rent :\t\t" +rs.getString("mcb_rent"));
                t1.append("\n   Service Tax :\t" +rs.getString("service_rent"));
                t1.append("\n   GST@9% :\t\t" +rs.getString("gst"));
                t1.append("\n");
                t1.append("-----------------------------------------------------------");
            }
            /*String q5="Select * from bill where meter_number=+co.getSelectedItem";
            ResultSet rs1=co.s.executeQuery(q5);*/
            rs=co.s.executeQuery("select * from bill where meter_number=" +c1.getSelectedItem());
            if(rs.next())
            {
                t1.append("\n       Current Month :\t"+rs.getNString("month"));
                t1.append("\n       Current Units :\t"+rs.getNString("units"));
                t1.append("\n       Current Amount :\t"+rs.getNString("amount"));
                t1.append("\n---------------------------------------------------------");
                t1.append("\n       TOTAL PAYBAL :"+rs.getString("amount"));
                
            }
         
        
        }    
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
        {
            new Generate_Bill().setVisible(true);
        }
            
}
