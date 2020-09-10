
package Electricity;

//import java.sql.DriverManager;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class new_customer extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b1,b2;
    
    new_customer()
    {
        super("NEW REGISTRATION");
        
        setLocation(350,200);
        setSize(850,600);
        
        JPanel p=new JPanel();
        
        p.setLayout(new GridLayout(11,4,10,10));
        
        p.setBackground(Color.WHITE);
        
        l1=new JLabel("Name");
        t1=new JTextField();
        
        p.add(l1);
        p.add(t1);
        
        l2=new JLabel("Meter No");
        t2=new JTextField();
        
        p.add(l2);
        p.add(t2);
        
        l3=new JLabel("Address");
        t3=new JTextField();
        
        p.add(l3);
        p.add(t3);
        
        l4=new JLabel("State");
        t4=new JTextField();
        
        p.add(l4);
        p.add(t4);
        
        l5=new JLabel("City");
        t5=new JTextField();
        
        p.add(l5);
        p.add(t5);
        
        
        l6=new JLabel("Email");
        t6=new JTextField();
        
        p.add(l6);
        p.add(t6);
        
        
        l7=new JLabel("Mobile No");
        t7=new JTextField();
        
        p.add(l7);
        p.add(t7);
        
        l9=new JLabel("User Name");
        t8=new JTextField();
        p.add(l9);
        p.add(t8);
        
        l10=new JLabel("Password");
        t9=new JTextField();
        p.add(l10);
        p.add(t9);
        
       
        b1=new JButton("Submit");
        b2=new JButton("Cancel");
        
        b1.setBackground(Color.BLACK);
        b2.setBackground(Color.BLACK);
        
        p.add(b1);
    
        p.add(b2);
        
        setLayout(new BorderLayout());
        add(p,"Center");
        
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/hicon2.jpg"));
        Image i2=i1.getImage().getScaledInstance(180,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
        l8=new JLabel(i3);
        
        add(l8,"West");
        
        
        getContentPane().setBackground(Color.WHITE);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String a=t1.getText();
        String c=t2.getText();
        String d=t3.getText();
        String e=t4.getText();
        String f=t5.getText();
        String g=t6.getText();
        String h=t7.getText();
        String i=t8.getText();
        String j=t9.getText();
        
        String q1="INSERT INTO emp VALUES ('"+a+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')";
        
        try
        {
            Conn c1=new Conn();
            c1.s.executeUpdate(q1);
            JOptionPane.showMessageDialog(null,"Customer Created");
            this.setVisible(false);
                    
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[]args)
    {
         new new_customer().setVisible(true);
    }
        
        
        
        
        
    
}
