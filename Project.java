
package Electricity;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Project extends JFrame implements ActionListener
        
{
    Project()
    {
            super("Electricity Billing Home Page");
    
            setSize(1920,1030);
            
            
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/elect1.jpg"));
            Image i2=i1.getImage().getScaledInstance(1300,650,Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel l1=new JLabel(i3);
            add(l1);
            
            
            
            JMenuBar mb=new JMenuBar();
            
            
            
            JMenu master=new JMenu("MASTER");
            JMenuItem m1=new JMenuItem("New Customer");
            JMenuItem m2=new JMenuItem("Customer Details");
            JMenuItem m3=new JMenuItem("Deposit Details");
            master.setForeground(Color.BLUE);
            
            
            m1.setFont(new Font("monospaced",Font.PLAIN,12));
            ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/icon1.png"));
            Image ii2=ii1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
            m1.setIcon(new ImageIcon(ii2));
            m1.setMnemonic('D');
            m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
            m1.setBackground(Color.WHITE);
            
            
            
            m2.setFont(new Font("monospaced",Font.PLAIN,12));
            ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/icon2.png"));
            Image iii2=iii1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
            m2.setIcon(new ImageIcon(iii2));
            m2.setMnemonic('M');
            m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
            m2.setBackground(Color.WHITE);
            
            
            
            m3.setFont(new Font("monospaced",Font.PLAIN,12));
            ImageIcon iiii1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/icon3.png"));
            Image iiii2=iiii1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
            m3.setIcon(new ImageIcon(iiii2));
            m3.setMnemonic('N');
            m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
            m3.setBackground(Color.WHITE);
            
            
            m1.addActionListener(this);
            m2.addActionListener(this);
            m3.addActionListener(this);
            
            
            
            
            JMenu user=new JMenu("USER");
            JMenuItem u1=new JMenuItem("Pay Bill");
            JMenuItem u2=new JMenuItem("Calculate Bill");
            JMenuItem u3=new JMenuItem("Last Bill");
            master.setForeground(Color.RED);
            
            
            u1.setFont(new Font("monospaced",Font.PLAIN,12));
            ImageIcon ia1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/icon4.png"));
            Image ia2=ia1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
            u1.setIcon(new ImageIcon(ia2));
            u1.setMnemonic('P');
            u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
            u1.setBackground(Color.WHITE);
            
            
            
            u2.setFont(new Font("monospaced",Font.PLAIN,12));
            ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/icon5.png"));
            Image im2=im1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
            u2.setIcon(new ImageIcon(im2));
            u2.setMnemonic('B');
            u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
            u2.setBackground(Color.WHITE);
            
            
            u3.setFont(new Font("monospaced",Font.PLAIN,12));
            ImageIcon ic1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/icon6.png"));
            Image ic2=ic1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
            u3.setIcon(new ImageIcon(ic2));
            u3.setMnemonic('N');
            u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
            u3.setBackground(Color.WHITE);
            
            
            u1.addActionListener(this);
            u2.addActionListener(this);
            u3.addActionListener(this);
            
            
            
            
            JMenu report=new JMenu("Report");
            JMenuItem r1=new JMenuItem("Generate Bill");            
            report.setForeground(Color.BLUE);
            
            
            r1.setFont(new Font("monospaced",Font.PLAIN,12));
            ImageIcon ig1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/icon7.png"));
            Image ig2=ig1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
            r1.setIcon(new ImageIcon(ig2));
            r1.setMnemonic('R');
            r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
            r1.setBackground(Color.WHITE);
            
            r1.addActionListener(this);
            
            
            
            
            JMenu utility=new JMenu("UTILITY");
            JMenuItem ut1=new JMenuItem("NotePad");
            JMenuItem ut2=new JMenuItem("Calculator");
            JMenuItem ut3=new JMenuItem("Web Browser");
            utility.setForeground(Color.RED);
            
            
            ut1.setFont(new Font("monospaced",Font.PLAIN,12));
            ImageIcon in1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/icon12.png"));
            Image in2=in1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
            ut1.setIcon(new ImageIcon(in2));
            ut1.setMnemonic('P');
            ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
            ut1.setBackground(Color.WHITE);
            
            
            
            ut2.setFont(new Font("monospaced",Font.PLAIN,12));
            ImageIcon ie1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/icon9.png"));
            Image ie2=ie1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
            ut2.setIcon(new ImageIcon(ie2));
            ut2.setMnemonic('C');
            ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
            ut2.setBackground(Color.WHITE);
            
            
            ut3.setFont(new Font("monospaced",Font.PLAIN,12));
            ImageIcon io1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/icon10.png"));
            Image io2=io1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
            ut3.setIcon(new ImageIcon(io2));
            ut3.setMnemonic('W');
            ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
            ut3.setBackground(Color.WHITE);
            
            
            ut1.addActionListener(this);
            ut2.addActionListener(this);
            ut3.addActionListener(this);
            
            
            
            JMenu exit=new JMenu("EXIT");
            JMenuItem e1=new JMenuItem("EXIT");            
            exit.setForeground(Color.BLUE);
            
            
            e1.setFont(new Font("monospaced",Font.PLAIN,12));
            ImageIcon ima1=new ImageIcon(ClassLoader.getSystemResource("Electricity/icon/icon11.png"));
            Image ima2=ima1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
            e1.setIcon(new ImageIcon(ima2));
            e1.setMnemonic('E');
            e1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
            e1.setBackground(Color.WHITE);
            
            e1.addActionListener(this);
            
            
            master.add(m1);
            master.add(m2);
            master.add(m3);
            
            user.add(u1);
            user.add(u2);
            user.add(u3);
            
            report.add(r1);
            
            utility.add(ut1);
            utility.add(ut2);
            utility.add(ut3);
            
            exit.add(e1);
            
            mb.add(master);
            mb.add(user);
            mb.add(report);
            mb.add(utility);
            mb.add(exit);
            
            
            setJMenuBar(mb);
            
            setFont(new Font("Senserif",Font.BOLD,16));
            setLayout(new FlowLayout());
            setVisible(false);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        
        String msg=ae.getActionCommand();
        if(msg.equals("Customer Details"))
                {
                     new Customer_Details().setVisible(true);
                }
        else if(msg.equals("New Customer"))
        {
            new new_customer().setVisible(true);
        }
        else if(msg.equals("Calculate Bill"))
        {
            new Calculate_Bill().setVisible(true);
                    
        }
        else if(msg.equals("Pay Bill"))
        {
            new Pay_Bill().setVisible(true);
        }
        else if(msg.equals("Notepad"))
        {
            try
            {
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e)
            {
                
            }
        }
        else if(msg.equals("Calculator"))
        {
            try
            {
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e)
            {
                
            }
        }
        else if(msg.equals("Web Browser"))
        {
            try
            {
                Runtime.getRuntime().exec("chrome.exe");
            }
            catch(Exception e)
                    {
                        
                    }
        }
        else if(msg.equals("Exit"))
                {
                   System.exit(0);
                }
        else if(msg.equals("Generate Bill"))
        {
            new Generate_Bill().setVisible(true);
        }
    }
    public static void main(String[]args)
    {
        new Project().setVisible(true);
    }
    
            
            
            
            
            
            
            
            
            
            
    
    
    
    
}

