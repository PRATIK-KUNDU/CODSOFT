package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;
    JLabel backgroundLabel;
    JLabel backgroundLabel1;
    JLabel backgroundLabel2;
    JLabel backgroundLabel3;
    JLabel backgroundLabel4;
    Rules(String name) {
        this.name = name;
        getContentPane().setLayout(null); 

        
        ImageIcon backgroundIcon1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        backgroundLabel = new JLabel(backgroundIcon1);
        backgroundLabel.setBounds(0, 0, 2000, 600); 
        getContentPane().add(backgroundLabel);
        
        ImageIcon backgroundIcon2 = new ImageIcon(ClassLoader.getSystemResource("icons/back1.png"));
        backgroundLabel1 = new JLabel(backgroundIcon2);
        backgroundLabel1.setBounds(0, 0, 700, 600); 
        getContentPane().add(backgroundLabel1);
        
        ImageIcon backgroundIcon3 = new ImageIcon(ClassLoader.getSystemResource("icons/back2.png"));
        backgroundLabel2 = new JLabel(backgroundIcon3);
        backgroundLabel2.setBounds(0, 0, 200, 600); 
        getContentPane().add(backgroundLabel2);
        
        ImageIcon backgroundIcon4 = new ImageIcon(ClassLoader.getSystemResource("icons/back3.png"));
        backgroundLabel3 = new JLabel(backgroundIcon3);
        backgroundLabel3.setBounds(0, 0, 735, 100); 
        getContentPane().add(backgroundLabel3);
        
        ImageIcon backgroundIcon5 = new ImageIcon(ClassLoader.getSystemResource("icons/back4.png"));
        backgroundLabel4 = new JLabel(backgroundIcon3);
        backgroundLabel4.setBounds(450, 0, 735, 100); 
        getContentPane().add(backgroundLabel4);
        

        JLabel heading = new JLabel("WELCOME " + name + " TO THINK FAST");
        heading.setBounds(200, 30, 1000, 50);
        heading.setFont(new Font("DUBAI", Font.BOLD, 40));
        heading.setForeground(Color.YELLOW);
        backgroundLabel.add(heading); 

        JLabel rules = new JLabel();
        rules.setBounds(30, 100, 1000, 350);
        rules.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 25));
        rules.setForeground(Color.WHITE);
        rules.setText(
                "<html>" +
                        "1. Players have a limited time to answer each question, adding urgency and excitement.<br><br>" +
                        "2. Players earn points for correct answers, motivating them to strive for accuracy.<br><br>" +
                        "3. Questions are typically in a multiple-choice format, making it accessible to a wide range of players.<br><br>" +
                        "4. Have fun while testing and expanding your computer knowledge.<br><br>" +
                        "5. Present questions in a random order or sequence to keep players engaged and prevent predictability.<br><br>" +
                        "</html>"
        );
        backgroundLabel.add(rules); 

        back = new JButton("EXIT");
        back.setBounds(300, 500, 150, 30);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        backgroundLabel.add(back); 

        start = new JButton("START");
        start.setBounds(80, 500, 150, 30);
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        backgroundLabel.add(start); 

        setSize(1200, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String args[]) {
        new Rules("user");
    }
}
