
package gui;
import model.*;
import javax.swing.*;

import java.util.ArrayList;
public class MainMenu extends javax.swing.JFrame {
    private  ArrayList<Student> listOfStudents;
    private  ArrayList<JeopardyGame>games;
    private int studentIndex;
    public MainMenu() {
        listOfStudents = new ArrayList<Student>();
        games = new ArrayList<JeopardyGame>();
        initComponents();     
    }
    public MainMenu(ArrayList<Student> list, ArrayList<JeopardyGame> g) {
        listOfStudents = new ArrayList<Student>();
        listOfStudents.addAll(list);
        games = new ArrayList<JeopardyGame>();
        games.addAll(g);
        initComponents();     
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainMenuLabel = new javax.swing.JLabel();
        loginMainMenuButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        mainMenuLabel.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        mainMenuLabel.setText("Main Menu");

        loginMainMenuButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginMainMenuButton.setText("Student Editor");
        loginMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMainMenuButtonActionPerformed(evt);
            }
        });

        playButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playButton.setText("Game Editor");
        playButton.setToolTipText("");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainMenuLabel)
                    .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginMainMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(mainMenuLabel)
                .addGap(52, 52, 52)
                .addComponent(loginMainMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMainMenuButtonActionPerformed
        if (this.listOfStudents.isEmpty()){
            StudentMenu m  = new StudentMenu();
            m.setVisible(true);
            this.dispose();
        }
        else{
            StudentMenu m = new StudentMenu(listOfStudents,games);
            m.setVisible(true);
            this.dispose();
        }
        
              
    }//GEN-LAST:event_loginMainMenuButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        GameModule g = new GameModule(games,listOfStudents);
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_playButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginMainMenuButton;
    private javax.swing.JLabel mainMenuLabel;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables
}
