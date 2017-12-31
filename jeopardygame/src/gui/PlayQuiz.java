
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.blue;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.JeopardyGame;
import model.ListModel;
import model.Question;
import model.Student;


public class PlayQuiz extends javax.swing.JFrame {

private JeopardyGame game;

private ArrayList<Student>listOfStudents;
static int[] points;
public static JLabel label;
public static int playerNumber;
public static JPanel mainPanel;
public static int sizeOfStudentList;
    public PlayQuiz() {
        this.listOfStudents = new ArrayList<>();
        
        
        
        initComponents();
        initBoard();
    }

    public PlayQuiz(JeopardyGame game) {
        this.listOfStudents = new ArrayList<>();
        this.listOfStudents.addAll(game.getStudents());
        
        if (listOfStudents.size()>0){
        sizeOfStudentList = listOfStudents.size();
        points =  new int [sizeOfStudentList];
        for (int i = 0 ; i < listOfStudents.size();i++)
            points[i] = 0;
        
        }
        this.game = game;
        
        
        initComponents();
        
        initBoard();
        
    }
    public void initBoard(){
        //create an instance of container component
        mainPanel = new JPanel();
        //change configuration
        mainPanel.setLayout(new BorderLayout());
        JPanel rightPanel = new JPanel();
        label = new JLabel("");
        rightPanel.add(label);
        mainPanel.add(rightPanel,BorderLayout.EAST);
        //add sub component
        //JPanel titlePanel = new JPanel();
        //titlePanel.add(new JLabel(game.getQuiz().getTitle()));
        //mainPanel.add(titlePanel, BorderLayout.NORTH);
        
        int rows = game.getQuiz().getNumberOfQuestions()/2;
        int cols = game.getQuiz().getNumberOfQuestions()/2;
        JPanel centerPanel = new JPanel(
                new GridLayout(rows, cols));
        int k = 0;
        //if ( game.getQuiz().getNumberOfQuestions()% 2 != 0 || game.getQuiz().getNumberOfQuestions()>7) cols -=1;
        int limit = game.getQuiz().getNumberOfQuestions();
       try{
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                QuestionButton cell = new QuestionButton(this.game.getQuiz().getQustionFromIndex(i * 2 + j));
                cell.setText("" + this.game.getQuiz().getQustionFromIndex(i * 2 + j).getPoints());
                cell.setPreferredSize(new Dimension(100,100));
               cell.addActionListener(new ButtonActionListener(this.game));
                centerPanel.add(cell);
                k++;
            }  
         }   
        }
       
       catch(IndexOutOfBoundsException e){
           
       }
       
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        JButton doneButton = new JButton("Done");
       doneButton.addActionListener(this::doneButtonAction);
      // doneButton.setPreferredSize(new Dimension(60,60));
       mainPanel.add(doneButton,BorderLayout.SOUTH);
       
       JComboBox combo = new JComboBox();
       
       for (Student s : listOfStudents){
           String str = s.getName();
           
           combo.addItem(str);
       
       }
       
       
       combo.setPreferredSize(new Dimension(20,40));
       combo.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               changeCombo(e,combo);
           }
       });
       mainPanel.add(combo,BorderLayout.NORTH);
        //link with parent component
        this.setContentPane(mainPanel);
    }
    private void doneButtonAction(ActionEvent e){
        this.dispose();
    }
    private void changeCombo(ActionEvent e, JComboBox combo){
        playerNumber = combo.getSelectedIndex();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    class QuestionButton extends JButton{
        Question question;
        public QuestionButton(Question q){
            this.question = q;
        }
        public Question getQuestion(){
            return this.question;
        }
    }
    class ButtonActionListener implements ActionListener  {
        JeopardyGame game;
        Question question;
        public ButtonActionListener(JeopardyGame g){
            this.game = g;
            
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            //TODO handling event when user click the button
            //1. get event source
            //2. get button index
            this.question = ((QuestionButton)e.getSource()).getQuestion();
           
            //3. retrieve question
           // this.question = this.game.getQuiz().getQustionFromIndex(index);
           String userAnswer = JOptionPane.showInputDialog(null,this.question.getQuestion(),"Category: " + this.question.getCategory(),3);            
           if (this.question.getAnswer().equals(userAnswer)){
               JOptionPane.showMessageDialog(null, "Correct Answer, " + this.game.getStudents().get(playerNumber).getName() +"!");
               points[playerNumber] += this.question.getPoints();
           } else {
               JOptionPane.showMessageDialog(null, "Wrong. You'll get it next time,  " + this.game.getStudents().get(playerNumber).getName()+ "!");
               
               points[playerNumber] -= this.question.getPoints();
           }
           label.setText(this.game.getStudents().get(playerNumber).getName() + " score: " + points[playerNumber]);
           
        }
    }
    
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
            java.util.logging.Logger.getLogger(PlayQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new PlayQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
