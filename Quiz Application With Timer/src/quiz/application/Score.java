package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    JLabel backgroundLabel;

    Score(String name, int score, String[] correctAnswers) {
        setBounds(480, 250, 1000, 520);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 400, 480);
        add(image);

        ImageIcon backgroundIcon1 = new ImageIcon(ClassLoader.getSystemResource("icons/back5.png"));
        backgroundLabel = new JLabel(backgroundIcon1);
        backgroundLabel.setBounds(400, 0, 1440, 800);
        getContentPane().add(backgroundLabel);

        JLabel heading = new JLabel("THANK YOU " + name + " FOR PLAYING THE QUIZ GAME😄 ");
        heading.setBounds(  0, 60, 1000, 30);
        heading.setFont(new Font("AIRIEL", Font.BOLD, 18));
        heading.setForeground(new Color(255, 255, 255));
        backgroundLabel.add(heading);

        JLabel score1 = new JLabel("TOTAL SCORE = " + score);
        score1.setBounds(80, 100, 1000, 100);
        score1.setFont(new Font("CALIBRI", Font.BOLD, 30));
        score1.setForeground(Color.WHITE);
        backgroundLabel.add(score1);
        
        JButton playAgainButton = new JButton("PLAY AGAIN");
        playAgainButton.setBounds(120, 180, 120, 30);
        playAgainButton.setForeground(Color.BLACK);
        playAgainButton.addActionListener(this);
        backgroundLabel.add(playAgainButton);

        JTextArea answersArea = new JTextArea();
        answersArea.setEditable(false);
        answersArea.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        answersArea.setForeground(Color.WHITE);
        answersArea.setOpaque(false);
        answersArea.setBounds(80, 250, 450, 220);
        StringBuilder answersText = new StringBuilder("CORRECT ANSWERS ARE:\n");
        for (int i = 0; i < correctAnswers.length; i++) {
            answersText.append("Question ").append(i + 1).append(": ").append(correctAnswers[i]).append("\n");
        }
        answersArea.setText(answersText.toString());
        backgroundLabel.add(answersArea);

        

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
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
        new Score("User", 0, correctAnswers);
    }
}
