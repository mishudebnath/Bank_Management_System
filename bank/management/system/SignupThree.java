
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancle;
    
    String formno;
    
    SignupThree(String formno)
    {
        this.formno = formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 20, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 100, 200, 30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 140, 170, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 140, 250, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 180, 170, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 180, 250, 20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 240, 200, 30);
        add(card);
        
        JLabel number = new JLabel("xxxx-xxxx-xxxx-4134");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 240, 300, 30);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 270, 300, 20);
        add(carddetail);
        
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 310, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("xxxx");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 310, 300, 30);
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 340, 300, 20);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 380, 400, 30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 430, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 430, 200, 30);
        add(c2);
        
        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 480, 200, 30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 480, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 530, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 530, 200, 30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 590, 600, 30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Ralleway", Font.BOLD, 14));
        submit.setBounds(250, 640, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancle = new JButton("Cancle");
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Ralleway", Font.BOLD, 14));
        cancle.setBounds(420, 640, 100, 30);
        cancle.addActionListener(this);
        add(cancle);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800, 735);
        setLocation(350, 0);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == submit)
       {
           String accountType = null;
           if(r1.isSelected()){
               accountType = "Saving Account";
           }
           else if(r2.isSelected())
           {
               accountType = "Fixed Deposit Account";
           }
           else if(r3.isSelected())
           {
               accountType = "Current Account";
           }
           else if(r4.isSelected())
           {
               accountType = "Recurring Deposit Account";
           }
           
           Random random = new Random();
           String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
           
           String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
 
           
           String facility = "";
           if(c1.isSelected())
           {
               facility = facility + " ATM CARD";
           }
           else if(c2.isSelected())
           {
               facility = facility + " Internet Banking";
           }
           else if(c3.isSelected())
           {
               facility = facility + " Mobile Banking";
           }
           else if(c4.isSelected())
           {
               facility = facility + " EMAIL & SMS Alerts";
           }
           else if(c5.isSelected())
           {
               facility = facility + " Cheque Book";
           }
           else if(c6.isSelected())
           {
               facility = facility + " E-Statement";
           }
           
           try{
          
               if(accountType.equals("")){
                   JOptionPane.showMessageDialog(null, "Account Type is Required");
               }else{
                   Conn conn = new Conn();
                   String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                   String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                   
                   conn.s.executeUpdate(query1);
                   conn.s.executeUpdate(query2);
                   
                   JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n pin: " + pinnumber);
                   
                   setVisible(false);
                   new Deposit(pinnumber).setVisible(false);
                   
               }
       }
       catch(Exception e) {
           System.out.println(e);
       }
           
           
    }else if(ae.getSource() == cancle)
       {
           setVisible(false);
           new Login().setVisible(true);
       }
    }
    
    public static void main(String[] args) {
        new SignupThree("");
    }

}
