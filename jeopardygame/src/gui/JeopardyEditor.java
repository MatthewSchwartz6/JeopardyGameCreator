
package gui;
import model.*;
import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author alive
 */
public class JeopardyEditor extends javax.swing.JFrame {

    
    JeopardyGame game;
    Quiz quiz;
    Question question;
   
    private String newQuestion;
    private String newPoints;
    
    private ArrayList<Question>questList ;  
    private ArrayList<Student>students;
    private ArrayList<JeopardyGame>games;
    int index;
    int gameIndex;
    private ArrayList<String>categories;
    
    private String[]points;
    boolean isEditingQuestion;
    boolean isEditingGame;
    public JeopardyEditor(){
        initComponents();
    }
    public JeopardyEditor(ArrayList<JeopardyGame>g, ArrayList<Student>s) {
        //create game
        initComponents();  
        this.isEditingQuestion = false;
       this.isEditingGame = false;
        
        
        questList = new ArrayList<Question>();
        
        games = new ArrayList<>();
        games.addAll(g);
        students = new ArrayList<>();
        students.addAll(s);
        quiz = new Quiz();
        
      String [] cat = {"Science", "Literature", "Math", "Sports", "Technology", "Programming"};
      this.categories = new ArrayList<String>();
     for (String str : cat){
         this.categories.add(str);
     }
      
     
      
      String[]points = {"100", "200", "300", "400", "500"};
      this.points = points;
        
        game = new JeopardyGame(6,5,new ArrayList<String>(categories));
    }
    public JeopardyEditor(ArrayList<JeopardyGame>g, ArrayList<Student>s, int index) {
        //edit game
        initComponents();  
        this.isEditingGame = true;
        this.gameIndex = index;
        
        
        
        questList = new ArrayList<Question>();
        
        games = new ArrayList<>();
        games.addAll(g);
        students = new ArrayList<>();
        students.addAll(s);
        
        game = games.get(this.gameIndex);
        quiz = game.getQuiz();
        questList.addAll(quiz.getQuestions());
        question = quiz.getQustionFromIndex(0);
         String [] cat = {"Science", "Literature", "Math", "Sports", "Technology", "Programming"};
         this.categories = new ArrayList<String>();
        for (String str : cat){
            this.categories.add(str);
        }
      
        String[]points = {"100", "200", "300", "400", "500"};
        this.points = points;
        this.txtGameTitle.setText(quiz.getTitle());
        this.txtAnswer.setText(question.getAnswer());
        this.txtQuestion.setText(question.getQuestion());
        
    }
    public JeopardyEditor(ArrayList<JeopardyGame>g, ArrayList<Student>s, ArrayList<Question>q,Quiz quiz, Question question, int index,int gameIndex) {
        //after coming back from selecting a question to edit
        initComponents();  
        this.isEditingQuestion = true;     
        this.index = index;
        this.gameIndex = gameIndex;
        questList = new ArrayList<Question>();
        questList.addAll(q);
        games = new ArrayList<>();
        games.addAll(g);
        students = new ArrayList<>();
        students.addAll(s);
        this.quiz = quiz;
        
         String [] cat = {"Science", "Literature", "Math", "Sports", "Technology", "Programming"};
         this.categories = new ArrayList<String>();
        for (String str : cat){
            this.categories.add(str);
        }
      
        String[]points = {"100", "200", "300", "400", "500"};
        this.points = points;
      
        game = new JeopardyGame(6,5,new ArrayList<String>(categories));
        game.setQuiz(quiz);
        question = new Question(question);
        this.txtGameTitle.setText(quiz.getTitle());
        this.txtAnswer.setText(question.getAnswer());
        this.txtQuestion.setText(question.getQuestion());
        

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        createGamePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        buttonSave = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        enterQuestionPointsLabel = new javax.swing.JLabel();
        buttonSaveAndReturn = new javax.swing.JButton();
        comboBoxPoints = new javax.swing.JComboBox<>();
        buttonQuestionList = new javax.swing.JButton();
        comboBoxCat = new javax.swing.JComboBox<>();
        enterQuestionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnswer = new javax.swing.JTextArea();
        txtGameTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setSize(new java.awt.Dimension(750, 450));

        createGamePanel.setBackground(new java.awt.Color(44, 219, 231));
        createGamePanel.setMinimumSize(new java.awt.Dimension(0, 0));
        createGamePanel.setName(""); // NOI18N
        createGamePanel.setPreferredSize(new java.awt.Dimension(750, 450));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Create Jeopardy Game");

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane2.setViewportView(txtQuestion);

        buttonSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonSave.setText("SAVE");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonClear.setText("CLEAR");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonAdd.setText("ADD");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        enterQuestionPointsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterQuestionPointsLabel.setText("Enter Points");

        buttonSaveAndReturn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonSaveAndReturn.setText("SAVE/RETURN");
        buttonSaveAndReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveAndReturnActionPerformed(evt);
            }
        });

        comboBoxPoints.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200", "300", "400", "500" }));
        comboBoxPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPointsActionPerformed(evt);
            }
        });

        buttonQuestionList.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        buttonQuestionList.setText("Question List");
        buttonQuestionList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonQuestionListActionPerformed(evt);
            }
        });

        comboBoxCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science", "Literature", "Math", "Sports", "Technology", "Programming" }));

        enterQuestionLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterQuestionLabel.setText("Enter Question");

        txtAnswer.setColumns(20);
        txtAnswer.setRows(5);
        txtAnswer.setText("Please type the question's answer");
        txtAnswer.setToolTipText("");
        txtAnswer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtAnswer);

        txtGameTitle.setText("Enter game title name here.");

        jLabel2.setText("Select a category");

        javax.swing.GroupLayout createGamePanelLayout = new javax.swing.GroupLayout(createGamePanel);
        createGamePanel.setLayout(createGamePanelLayout);
        createGamePanelLayout.setHorizontalGroup(
            createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createGamePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createGamePanelLayout.createSequentialGroup()
                        .addGroup(createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createGamePanelLayout.createSequentialGroup()
                                .addGroup(createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(comboBoxPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterQuestionPointsLabel)
                                    .addGroup(createGamePanelLayout.createSequentialGroup()
                                        .addComponent(buttonAdd)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonClear)))
                                .addGap(0, 106, Short.MAX_VALUE))
                            .addComponent(txtGameTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createGamePanelLayout.createSequentialGroup()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonQuestionList, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createGamePanelLayout.createSequentialGroup()
                                .addComponent(buttonSaveAndReturn)
                                .addGap(35, 35, 35)
                                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(createGamePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(createGamePanelLayout.createSequentialGroup()
                        .addGroup(createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(comboBoxCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        createGamePanelLayout.setVerticalGroup(
            createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createGamePanelLayout.createSequentialGroup()
                .addGroup(createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createGamePanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(createGamePanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(buttonQuestionList, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createGamePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enterQuestionPointsLabel)
                .addGap(18, 18, 18)
                .addGroup(createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createGamePanelLayout.createSequentialGroup()
                        .addComponent(comboBoxPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonAdd)
                            .addComponent(buttonClear)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createGamePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(createGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSaveAndReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        //ADD Question
        
        question = new Question();
        question.setQuestion(this.txtQuestion.getText());
        question.setAnswer(this.txtAnswer.getText());
        
        int index = this.comboBoxPoints.getSelectedIndex();
        if (index > 0){
            int points = Integer.parseInt(this.points[index]);
            question.setPoints(points);
        } else {           
            question.setPoints(100);
        }
        
        index = this.comboBoxCat.getSelectedIndex();
        question.setCategory(this.categories.get(index));
        
        questList.add(question);
        txtQuestion.setText("");     
        txtAnswer.setText("");
        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        txtQuestion.setText("");     
        txtAnswer.setText("");
        
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        if (questList.size()== 0){
            JOptionPane.showMessageDialog(null,"You cannot save a game with no questions added.");
            return;
        }
        if (isEditingQuestion){
            questList.remove(this.index);
            question = new Question();
            question.setQuestion(this.txtQuestion.getText());
            question.setAnswer(this.txtAnswer.getText());

            int index = this.comboBoxPoints.getSelectedIndex();
            if (index > 0){
                int points = Integer.parseInt(this.points[index]);
                question.setPoints(points);
            } else {           
                question.setPoints(100);
            }

            index = this.comboBoxCat.getSelectedIndex();
            question.setCategory(this.categories.get(index));

            questList.add(this.index, question);

            quiz = new Quiz(this.txtGameTitle.getText(),"A jeopardy game", questList);
            game.setQuiz(quiz);
        } 
        
        else if (isEditingGame){
            questList.remove(0);
            question = new Question();
            question.setQuestion(this.txtQuestion.getText());
            question.setAnswer(this.txtAnswer.getText());

            int index = this.comboBoxPoints.getSelectedIndex();
            if (index > 0){
                int points = Integer.parseInt(this.points[index]);
                question.setPoints(points);
            } else {           
                question.setPoints(100);
            }

            index = this.comboBoxCat.getSelectedIndex();
            question.setCategory(this.categories.get(index));

            questList.add(0, question);

            quiz = new Quiz(this.txtGameTitle.getText(),"A jeopardy game", questList);
            game.setQuiz(quiz);
        
        }
        
        else{
            quiz = new Quiz(this.txtGameTitle.getText(),"A jeopardy game", questList);
            game.setQuiz(quiz);
        }
        
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonSaveAndReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveAndReturnActionPerformed
        if (isEditingGame || isEditingQuestion){
//            games.remove(gameIndex);
            quiz = new Quiz(this.txtGameTitle.getText(),"A jeopardy game", questList);
            game.setQuiz(quiz);
            games.add(gameIndex,game);
            GameModule g = new GameModule (games,students);
            g.setVisible(true);
            this.dispose();
        }
        else {
            quiz = new Quiz(this.txtGameTitle.getText(),"A jeopardy game", questList);
            game.setQuiz(quiz);
            games.add(game);
            GameModule g = new GameModule (games,students);
            g.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_buttonSaveAndReturnActionPerformed

    private void comboBoxPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPointsActionPerformed

    private void buttonQuestionListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonQuestionListActionPerformed
        if (quiz.getQuestions().isEmpty()){
            JOptionPane.showMessageDialog(null,"You must first save the game before selecting a question.");
            return;
        }
        QuestionList q = new QuestionList(games,students,questList,quiz,gameIndex);
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonQuestionListActionPerformed

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
            java.util.logging.Logger.getLogger(JeopardyEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JeopardyEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JeopardyEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JeopardyEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new JeopardyEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonClear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton buttonQuestionList;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSaveAndReturn;
    private javax.swing.JComboBox<String> comboBoxCat;
    private javax.swing.JComboBox<String> comboBoxPoints;
    private javax.swing.JPanel createGamePanel;
    private javax.swing.JLabel enterQuestionLabel;
    private javax.swing.JLabel enterQuestionPointsLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextArea txtAnswer;
    private javax.swing.JTextField txtGameTitle;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
