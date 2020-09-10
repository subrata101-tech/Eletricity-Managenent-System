
package Electricity;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JButton b1,b2,b3;
    JPanel p1,p2,p3,p4;
    JTextField t1,t2;
    JPasswordField pf2;
    
    
    Login()
    {
        super("Login Page");
        
        
        l1=new JLabel("User Name");
        l2=new JLabel("Password");
        t1=new JTextField(15);
        pf2=new JPasswordField(15);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/login.png"));
        Image i2=i1.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT); 
        b1=new JButton("Login",new ImageIcon(i2));
        
        ImageIcon ii2=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/cancel.jpg"));
        Image ii3=ii2.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        b2=new JButton("Cancel",new ImageIcon(ii3));
        
        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/download.png"));
        Image ia1=im1.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        b3=new JButton("Registration",new ImageIcon(ia1));
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/pop.png"));
        Image i5=i4.getImage().getScaledInstance(128,128,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        l3=new JLabel(i6);
        
        
        setLayout(new BorderLayout());
        
        
         
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        
        add(l3,BorderLayout.WEST);
        p2.add(l1);
        p2.add(t1);
        p2.add(l2);
        p2.add(pf2);
        add(p2,BorderLayout.CENTER);
        
        p4.add(b1);
        p4.add(b2);
        p4.add(b3);
        add(p4,BorderLayout.SOUTH);
        
        
        p2.setBackground(Color.WHITE);
        p4.setBackground(Color.WHITE);
        
        setSize(440,250);
        setLocation(600,400);
        setVisible(true);    
        
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            Conn c1=new Conn();
            String a=t1.getText();
            String b=pf2.getText();
            String q="select * from emp where username='"+a+"' and password='"+b+"'";
            ResultSet rs=c1.s.executeQuery(q);
            
            if(rs.next())
            {
                 new Project().setVisible(true);
                 this.setVisible(false);
                 
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Login");
                setVisible(false);
                new new_customer().setVisible(true);
                
            }
          
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("error :"+e);
        }
    }
    
    public static void main(String[]args)
    {
        new Login().setVisible(true);
      //new new_customer().setVisible(true);
    }
}

