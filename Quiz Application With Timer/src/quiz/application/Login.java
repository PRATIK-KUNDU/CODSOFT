
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField bname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        JLabel image=new JLabel(i1);
        image.setBounds(600, 0, 600, 500);
        add(image);
        JLabel heading=new JLabel("THINK FAST");
        heading.setBounds(120, 30, 300, 50);
        heading.setFont(new Font("KRISTEN ITC", Font.BOLD, 40));
        heading.setForeground(Color.RED);
        add(heading);
        
        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(95, 200, 300, 50);
        name.setFont(new Font("COURIER NEW", Font.BOLD, 25));
        name.setForeground(Color.gray);
        add(name);
        
        bname=new JTextField();
        bname.setBounds(65, 250,350,30);
        bname.setFont(new Font("CALIBRI", Font.BOLD, 25));
        add(bname);
        
        rules=new JButton("RULES");
        rules.setBounds(300, 350, 150, 30);
        rules.setForeground(Color.black);
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("EXIT");
        back.setBounds(80, 350, 150, 30);
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(350, 250);
        setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==rules){
           String name=bname.getText();
           setVisible(false);
           new Rules(name);
       } else if (ae.getSource()==back){
           setVisible(false);
           
       }
    }
    
 public static void main(String[] args) {
     new Login();
 }  
}

