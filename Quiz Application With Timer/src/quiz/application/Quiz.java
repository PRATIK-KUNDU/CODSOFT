
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Quiz extends JFrame implements ActionListener {
    
    JLabel backgroundLabel;
    String q[][]=new String[10][5];
    String a[][]=new String[10][2];
    String userans[][]=new String[10][1];
    JLabel qn,question;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupopt;
    JButton next,ll,sub;
    public static int timer=10;
    public static int ans=0;
    public static int c=0;
    public static int score=0;
    String name;
    String[] correctAnswers = {
                "Processing",
                "RAM",
                "Hard disk drive",
                "Basic Input/Output System",
                "Flash Drive",
                "Handling graphics rendering",
                "USB",
                "Redundant Array of Independent Disks",
                "Keyboard",
                "Provide backup power during outages"
        };
    Quiz(String name){
        this.name=name;
        setBounds(200, 0, 1440, 1050);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0, 0, 1440, 400);
        add(image);
        
        ImageIcon backgroundIcon1 = new ImageIcon(ClassLoader.getSystemResource("icons/back5.png"));
        backgroundLabel = new JLabel(backgroundIcon1);
        backgroundLabel.setBounds(0, 0, 1440, 1150); 
        getContentPane().add(backgroundLabel);

        
        qn=new JLabel();
        qn.setBounds(100,450,80,50);
        qn.setFont(new Font("KRISTEN ITC", Font.BOLD, 30));
        qn.setForeground(Color.WHITE);         
        backgroundLabel.add(qn);
        
        question=new JLabel();
        question.setBounds(150,450,1200,50);
        question.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 30));
        question.setForeground(Color.WHITE);         
        backgroundLabel.add(question);
        
        q[0][0] = "What is the primary function of a CPU in a computer?";
        q[0][1] = "Storage";
        q[0][2] = "Processing";
        q[0][3] = "Display";
        q[0][4] = "Input";

        q[1][0] = "Which of the following is a volatile memory in a computer?";
        q[1][1] = "Hard disk";
        q[1][2] = "SSD";
        q[1][3] = "RAM";
        q[1][4] = "ROM";

        q[2][0] = "Which component is responsible for storing data permanently in a computer system?";
        q[2][1] = "RAM";
        q[2][2] = "CPU";
        q[2][3] = "Cache memory";
        q[2][4] = "Hard disk drive";

        q[3][0] = "What does BIOS stand for in a computer system?";
        q[3][1] = "Binary Input/Output System";
        q[3][2] = "Basic Input/Output System";
        q[3][3] = "Basic Integrated Operating System";
        q[3][4] = "Binary Integrated Operating System";

        q[4][0] = "Which of the following is NOT a type of optical storage device?";
        q[4][1] = "Flash Drive";
        q[4][2] = "Blu-ray Disc";
        q[4][3] = "DVD-ROM";
        q[4][4] = "CD-ROM";

        q[5][0] = "What is the purpose of a GPU in a computer system?";
        q[5][1] = "Processing arithmetic operations";
        q[5][2] = "Storing temporary data";
        q[5][3] = "Handling graphics rendering";
        q[5][4] = "Managing input/output operations";

        q[6][0] = "Which port is typically used to connect a printer to a computer?";
        q[6][1] = "USB";
        q[6][2] = "HDMI";
        q[6][3] = "VGA";
        q[6][4] = "Ethernet";

       

 	q[7][0] = "What does RAID stand for in the context of computer storage?"; 
        q[7][1] = "Random Access Integrated Drive";
        q[7][2] = "Rapid Access and Input Device";
        q[7][3] = "Redundant Array of Independent Disks";
        q[7][4] = "Remote Authentication and Integrated Disks";

        q[8][0] = "Which of the following is a primary input device for a computer system?";
        q[8][1] = "Monitor";
        q[8][2] = "Speaker";
        q[8][3] = "Printer";
        q[8][4] = "Keyboard";

        q[9][0] = "What is the purpose of a UPS (Uninterruptible Power Supply) in a computer setup?";
        q[9][1] = "Provide backup power during outages";
        q[9][2] = "Increase processing speed";
        q[9][3] = "Improve graphics performance";
        q[9][4] = "Enhance network connectivity";
        
        a[0][1] = "Processing";
        a[1][1] = "RAM";
        a[2][1] = "Hard disk drive";
        a[3][1] = "Basic Input/Output System";
        a[4][1] = "Flash Drive";
        a[5][1] = "Handling graphics rendering";
        a[6][1] = "USB";
        a[7][1] = "Redundant Array of Independent Disks";
        a[8][1] = "Keyboard";
        a[9][1] = "Provide backup power during outages";
        
        opt1= new JRadioButton();
        opt1.setBounds(150, 500, 800, 50);
        opt1.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 25));
        opt1.setForeground(Color.YELLOW); 
        opt1.setOpaque(false);
        backgroundLabel.add(opt1);
        
        opt2= new JRadioButton();
        opt2.setBounds(150, 540, 800, 50);
        opt2.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 25));
        opt2.setForeground(Color.YELLOW); 
        opt2.setOpaque(false);
        backgroundLabel.add(opt2);
        
        opt3= new JRadioButton();
        opt3.setBounds(150, 580, 800, 50);
        opt3.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 25));
        opt3.setForeground(Color.YELLOW); 
        opt3.setOpaque(false);
        backgroundLabel.add(opt3);
        
        opt4= new JRadioButton();
        opt4.setBounds(150, 620, 800, 50);
        opt4.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 25));
        opt4.setForeground(Color.YELLOW); 
        opt4.setOpaque(false);
        backgroundLabel.add(opt4);
        
        groupopt=new ButtonGroup();
        groupopt.add(opt1);
        groupopt.add(opt2);
        groupopt.add(opt3);
        groupopt.add(opt4);
        
        
        next = new JButton("NEXT");
        next.setBounds(500, 800, 100, 30);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        backgroundLabel.add(next); 
        
        ll = new JButton("LIFELINE");
        ll.setBounds(300, 800, 100, 30);
        ll.setForeground(Color.BLACK);
        ll.addActionListener(this);
        backgroundLabel.add(ll); 
        
        sub = new JButton("SUBMIT");
        sub.setBounds(100, 800, 100, 30);
        sub.setForeground(Color.BLACK);
        sub.addActionListener(this);
        sub.setEnabled(false);
        backgroundLabel.add(sub); 
        
        start(c);



        
        setVisible(true);  
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans=1;
            if(groupopt.getSelection()==null){
                userans[c][0]="";
                
                
            }else{
                userans[c][0]=groupopt.getSelection().getActionCommand();
                
            }
            if(c==8){
                next.setEnabled(false);
                sub.setEnabled(true);            }
            c++;
            start(c);
            
        }else if (ae.getSource() == ll){
            if(c==2||c==4||c==6||c==8||c==9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            ll.setEnabled(false);
            
        }else if(ae.getSource()==sub){
            ans=1;
             if(groupopt.getSelection()==null){
                userans[c][0]="";
                
                
            }else{
                userans[c][0]=groupopt.getSelection().getActionCommand();
                
            }
                for(int i=0;i<userans.length;i++){
                    if(userans[i][0].equals(a[i][1])){
                      score=score+10;  
                    }else{
                        score=score+0;
                    }
                        
                }
                setVisible(false);
                new Score(name, score, correctAnswers);
            
        }
        
    }
    public void paint(Graphics g){
        super.paint(g);
        String t="TIME REMAINING:- "+ timer + " seconds ⌚⌚";
        g.setColor(Color.GREEN);
        g.setFont(new Font("Ariel", Font.BOLD, 30));
        
        if(timer>0){
            g.drawString(t, 900, 470);
        }else{
            g.drawString("NO TIME LEFT 😔😔😔☹️☹️☹️", 900, 470);
        
    }
        timer--;
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch (Exception e){
            e.printStackTrace();
        }
        if(ans==1){
            ans=0;
            timer=10;
            
        }else if(timer<0){
            timer=10;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(c==8){
                next.setEnabled(false);
                sub.setEnabled(true);  
            }
            if(c==9){
                if(groupopt.getSelection()==null){
                userans[c][0]="";
                
                
            }else{
                userans[c][0]=groupopt.getSelection().getActionCommand();
                
            }
                for(int i=0;i<userans.length;i++){
                    if(userans[i][0].equals(a[i][1])){
                      score=score+10;  
                    }else{
                        score=score+0;
                    }
                        
                }
                setVisible(false);
                new Score(name, score, correctAnswers);
                
            }else{
               if(groupopt.getSelection()==null){
                userans[c][0]="";
                
                
            }else{
                userans[c][0]=groupopt.getSelection().getActionCommand();
                
            }
            c++;
            start(c);
        }
        }
    }
    public void start(int count){
        qn.setText(""+(count+1+". "));
        question.setText(q[count][0]);
        opt1.setText(q[count][1]);
        opt1.setActionCommand(q[c][1]);
        opt2.setText(q[count][2]);
        opt2.setActionCommand(q[c][2]);
        opt3.setText(q[count][3]);
        opt3.setActionCommand(q[c][3]);
        opt4.setText(q[count][4]);
        opt4.setActionCommand(q[c][4]);
        groupopt.clearSelection();



    }
    public static void main(String[] args){
        new Quiz("User");
    }
}
