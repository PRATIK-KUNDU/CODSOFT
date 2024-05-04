package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// Custom JButton class for glowing effect
class GlowButton extends JButton {
    private boolean isHovered = false;
    private Color glowColor = new Color(255, 255, 0, 150); // Yellow with transparency

    public GlowButton(String text) {
        super(text);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        addActionListener(e -> repaint());
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                isHovered = true;
                repaint();
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                isHovered = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (isHovered) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setPaint(glowColor);
            int r = Math.max(getWidth(), getHeight());
            g2.fillOval(getWidth() / 2 - r / 2, getHeight() / 2 - r / 2, r, r);
            g2.dispose();
        }
        super.paintComponent(g);
    }
}

public class NumberGame extends JFrame implements ActionListener {
    private int randomNumber;
    private int attemptsLeft;
    private int score;
    private String playerName;

    private JLabel welcomeLabel; // For welcome message
    private JLabel nameLabel;
    private JPanel namePanel; // Container for name components
    private JTextField nameField;
    private JButton startButton; 

    private JLabel instructionLabel;
    private JPanel guessPanel; // For guess components
    private JTextField guessField;
    private JButton guessButton; 
    private JLabel resultLabel;
    private JLabel scoreLabel;
    private JButton playAgainButton;  
    private JButton exitButton; 

    public NumberGame() {
        setTitle("Number Guessing Game");
        setSize(880, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1));
        getContentPane().setBackground(new Color(173, 216, 230));
        setLocationRelativeTo(null);

        welcomeLabel = new JLabel("WELCOME TO THE NUMBER GAME !!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(welcomeLabel); // Welcome label to the frame

        nameLabel = new JLabel("Enter your name:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 24));

        nameField = new JTextField(15); // Adjust width of name field
        nameField.setFont(new Font("Arial", Font.PLAIN, 24));
        startButton = new GlowButton("Start Game"); // Initialize as GlowButton
        startButton.setFont(new Font("Arial", Font.BOLD, 20));

        namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // FlowLayout for namePanel
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        namePanel.add(startButton);

        instructionLabel = new JLabel("Guess a number between 1 and 100:");
        instructionLabel.setFont(new Font("Arial", Font.BOLD, 24));

        guessField = new JTextField(10);
        guessField.setFont(new Font("Arial", Font.PLAIN, 24));
        guessButton = new GlowButton("Guess"); // Initialize as GlowButton
        guessButton.setFont(new Font("Arial", Font.BOLD, 20));

        guessPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // FlowLayout for guessPanel
        guessPanel.add(instructionLabel);
        guessPanel.add(guessField);
        guessPanel.add(guessButton);

        resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 24));

        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 24));

        playAgainButton = new GlowButton("Play Again"); // Initialize as GlowButton
        exitButton = new GlowButton("Exit"); // Initialize as GlowButton

        playAgainButton.setFont(new Font("Arial", Font.BOLD, 20));
        exitButton.setFont(new Font("Arial", Font.BOLD, 20));

        add(namePanel);
        add(guessPanel);
        add(resultLabel);
        add(scoreLabel);
        add(playAgainButton);
        add(exitButton);

        startButton.addActionListener(this);
        guessButton.addActionListener(this);
        playAgainButton.addActionListener(this);
        exitButton.addActionListener(this);

        playerName = "";
        startGame();
    }

    private void startGame() {
        playerName = nameField.getText();
        randomNumber = new Random().nextInt(100) + 1;
        attemptsLeft = 5;
        score = 0;
        scoreLabel.setText("Score: " + score);
        resultLabel.setText("");
        guessField.setEnabled(false);
        guessButton.setEnabled(false);
        playAgainButton.setVisible(false);
        exitButton.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startGame();
            guessField.setEnabled(true);
            guessButton.setEnabled(true);
            startButton.setEnabled(false);
            nameField.setEnabled(false);
        } else if (e.getSource() == guessButton) {
            try {
                int guess = Integer.parseInt(guessField.getText());
                attemptsLeft--;

                if (guess == randomNumber) {
                    calculateScore();
                    resultLabel.setText("WOW! " + playerName + ", You guessed it right. CONGRATULATIONS! ");
                    guessField.setEnabled(false);
                    guessButton.setEnabled(false);
                    playAgainButton.setVisible(true);
                    exitButton.setVisible(true);
                } else if (attemptsLeft > 0) {
                    resultLabel.setText(guess < randomNumber ? "Too low! Attempts left: " + attemptsLeft :
                            "Too high! Attempts left: " + attemptsLeft);
                } else {
                    resultLabel.setText("OOPS! " + playerName + ", You ran out of attempts.\n The number was: " + randomNumber);
                    guessField.setEnabled(false);
                    guessButton.setEnabled(false);
                    playAgainButton.setVisible(true);
                    exitButton.setVisible(true);
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Enter a number.");
            }
        } else if (e.getSource() == playAgainButton) {
            nameField.setText("");
            startButton.setEnabled(true);
            nameField.setEnabled(true);
            startGame();
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    private void calculateScore() {
        switch (attemptsLeft) {
            case 4:
                score += 30;
                break;
            case 3:
                score += 30;
                break;
            case 2:
                score += 30;
                break;
            case 1:
                score += 20;
                break;
            default:
                score += 10;
                break;
        }
        scoreLabel.setText("Score: " + score);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NumberGame game = new NumberGame();
            game.setVisible(true);
        });
    }
}
