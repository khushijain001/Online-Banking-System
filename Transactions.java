
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener {
    
    
    JButton deposit,withdrawl,ministatement,pinchange,fastcash,balanceenquiry,exit;
    String pinnumber;
    Transactions (String pinnumber){
        this.pinnumber = pinnumber; 
        setLayout(null);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank/management/system/Icon/atm.jpg"));
       Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT );
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel (i3);
       image.setBounds(0,0,900,728);
       add(image);
       
       JLabel text = new JLabel ("Please select Your Transaction");
       text.setBounds(235,200,700,35);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("System",Font.BOLD,16));
       image.add(text);
       
       deposit = new JButton("Deposit");
       deposit.setBounds(170,330,150,30);
       deposit.addActionListener(this);
       image.add(deposit);
       
       withdrawl = new JButton("Cash Withdrawl");
       withdrawl.setBounds(355,330,150,30);
       withdrawl.addActionListener(this);
       image.add(withdrawl);
       
       
       fastcash = new JButton("Fast Cash");
       fastcash.setBounds(170,365,150,30);
       fastcash.addActionListener(this);
       image.add(fastcash);
       
       ministatement = new JButton("Mini Statement");
       ministatement.setBounds(355,365,150,30);
       image.add(ministatement);
       
       
       pinchange = new JButton("PIN Change ");
       pinchange.setBounds(170,400,150,30);
       pinchange.addActionListener(this);
       image.add(pinchange);
       
       balanceenquiry = new JButton("Balance Enquiry");
       balanceenquiry.setBounds(355,400,150,30);
       balanceenquiry.addActionListener(this);
       image.add(balanceenquiry);
       
       exit = new JButton("Exit");
       exit.setBounds(355,435,150,30);
       exit.addActionListener(this);
       image.add(exit);



       
       
       setSize(900,900);
       setLocation(300,0);
       setUndecorated(true);
       setVisible(true);
       
       
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        }
    }
        
    
    public static void main(String args[]){
        new Transactions("");
    }
    
}