
package student.grade.calculator;


public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NAMETF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PMARKS = new javax.swing.JTextField();
        RDBMSMARKS = new javax.swing.JTextField();
        CAMARKS = new javax.swing.JTextField();
        MATHMARKS = new javax.swing.JTextField();
        ETHICSMARKS = new javax.swing.JTextField();
        PPOINT = new javax.swing.JTextField();
        RDBMSPOINT = new javax.swing.JTextField();
        CAPOINT = new javax.swing.JTextField();
        MATHPOINT = new javax.swing.JTextField();
        ETHICSPOINT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TOTALTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        AVGTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        GRADETF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 700));
        setSize(new java.awt.Dimension(1440, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT GRADE CALCULATOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 30, 716, 73);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/grade/calculator/calc.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 20, 80, 88);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 204));
        jLabel4.setText("STUDENT  NAME :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(33, 142, 220, 36);

        NAMETF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NAMETF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(NAMETF);
        NAMETF.setBounds(270, 140, 311, 36);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(110, 242, 84));
        jLabel3.setText("SUBJECTS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 208, 135, 29);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(110, 242, 84));
        jLabel5.setText("MARKS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(314, 208, 88, 29);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(110, 242, 84));
        jLabel6.setText("CREDIT POINTS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(436, 208, 185, 29);

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PYTHON");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 280, 102, 26);

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("RDBMS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 340, 102, 26);

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("COMPUTER ARCHITECTURE");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 410, 280, 23);

        jLabel10.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DISCRETE MATHEMATICS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 480, 260, 23);

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("COMPUTER ETHICS");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 540, 230, 26);

        PMARKS.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        PMARKS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PMARKS);
        PMARKS.setBounds(314, 273, 114, 38);

        RDBMSMARKS.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        RDBMSMARKS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(RDBMSMARKS);
        RDBMSMARKS.setBounds(314, 335, 114, 38);

        CAMARKS.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        CAMARKS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(CAMARKS);
        CAMARKS.setBounds(310, 400, 114, 38);

        MATHMARKS.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        MATHMARKS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MATHMARKS);
        MATHMARKS.setBounds(310, 470, 114, 38);

        ETHICSMARKS.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        ETHICSMARKS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ETHICSMARKS);
        ETHICSMARKS.setBounds(310, 530, 114, 38);

        PPOINT.setEditable(false);
        PPOINT.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        PPOINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PPOINT);
        PPOINT.setBounds(460, 270, 102, 38);

        RDBMSPOINT.setEditable(false);
        RDBMSPOINT.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        RDBMSPOINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(RDBMSPOINT);
        RDBMSPOINT.setBounds(460, 340, 102, 38);

        CAPOINT.setEditable(false);
        CAPOINT.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        CAPOINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(CAPOINT);
        CAPOINT.setBounds(460, 400, 102, 38);

        MATHPOINT.setEditable(false);
        MATHPOINT.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        MATHPOINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MATHPOINT);
        MATHPOINT.setBounds(460, 470, 102, 38);

        ETHICSPOINT.setEditable(false);
        ETHICSPOINT.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        ETHICSPOINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ETHICSPOINT);
        ETHICSPOINT.setBounds(460, 530, 102, 38);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TOTAL:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(631, 263, 95, 38);

        TOTALTF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TOTALTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TOTALTF);
        TOTALTF.setBounds(880, 260, 104, 42);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("AVG PERCENTAGE:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(631, 339, 240, 36);

        AVGTF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AVGTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(AVGTF);
        AVGTF.setBounds(880, 350, 104, 36);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("GRADE:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(631, 410, 102, 60);

        GRADETF.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        GRADETF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(GRADETF);
        GRADETF.setBounds(880, 430, 104, 38);

        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 36)); // NOI18N
        jButton1.setText("CALCULATE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(631, 507, 252, 55);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/grade/calculator/back.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 1430, 660);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
   String studentName = NAMETF.getText();

        // Step 2: Retrieve marks for each subject from their respective text fields
        double pythonMarks = Double.parseDouble(PMARKS.getText());
        double rdbmsMarks = Double.parseDouble(RDBMSMARKS.getText());
        double caMarks = Double.parseDouble(CAMARKS.getText());
        double mathMarks = Double.parseDouble(MATHMARKS.getText());
        double ethicsMarks = Double.parseDouble(ETHICSMARKS.getText());

        // Step 3: Calculate credit points for each subject based on the marks
        double pythonPoints = calculateCreditPoints(pythonMarks);
        double rdbmsPoints = calculateCreditPoints(rdbmsMarks);
        double caPoints = calculateCreditPoints(caMarks);
        double mathPoints = calculateCreditPoints(mathMarks);
        double ethicsPoints = calculateCreditPoints(ethicsMarks);
        
         PPOINT.setText(String.valueOf(pythonPoints));
    RDBMSPOINT.setText(String.valueOf(rdbmsPoints));
    CAPOINT.setText(String.valueOf(caPoints));
    MATHPOINT.setText(String.valueOf(mathPoints));
    ETHICSPOINT.setText(String.valueOf(ethicsPoints));

        // Step 4: Calculate total marks
        double totalMarks = pythonMarks + rdbmsMarks + caMarks + mathMarks + ethicsMarks;
        TOTALTF.setText(String.valueOf(totalMarks));

        // Step 5: Calculate average percentage
        double totalPoints = pythonPoints + rdbmsPoints + caPoints + mathPoints + ethicsPoints;
         int numSubjects = 5; // Assuming there are 5 subjects
         double averageMarks = totalMarks / numSubjects;
         AVGTF.setText(String.format("%.2f", averageMarks));
        // Step 6: Determine grade based on the average percentage
        String grade = determineGrade(averageMarks);
        GRADETF.setText(grade);
    }  

    // Method to calculate credit points based on marks
    private double calculateCreditPoints(double marks) {
        if (marks >= 90) {
            return 10;
        } else if (marks >= 80) {
            return 9;
        } else if (marks >= 70) {
            return 8;
        } else if (marks >= 60) {
            return 7;
        } else if (marks >= 50) {
            return 6;
        } else {
            return 0;
        }
    }

    // Method to determine grade based on average percentage
    private String determineGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else if (averagePercentage >= 50) {
            return "D";
        } else {
            return "F";
        }

    }//GEN-LAST:event_jButton1MouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AVGTF;
    private javax.swing.JTextField CAMARKS;
    private javax.swing.JTextField CAPOINT;
    private javax.swing.JTextField ETHICSMARKS;
    private javax.swing.JTextField ETHICSPOINT;
    private javax.swing.JTextField GRADETF;
    private javax.swing.JTextField MATHMARKS;
    private javax.swing.JTextField MATHPOINT;
    private javax.swing.JTextField NAMETF;
    private javax.swing.JTextField PMARKS;
    private javax.swing.JTextField PPOINT;
    private javax.swing.JTextField RDBMSMARKS;
    private javax.swing.JTextField RDBMSPOINT;
    private javax.swing.JTextField TOTALTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
