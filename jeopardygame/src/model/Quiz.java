/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author alive
 */
public class Quiz {
    private String title;
    private String description;
    private ArrayList<Question>listOfQuestions;
    public Quiz(){
        listOfQuestions = new ArrayList<>();
        title = "";
        description = "";
    }
    public Quiz(String t, String d, ArrayList<Question>l){
        title = t; description = d; listOfQuestions = new ArrayList<>(); listOfQuestions.addAll(l);
    }
    public Quiz(Quiz q){
        this.title= q.getTitle();
        this.description = q.getDescription();
        listOfQuestions = new ArrayList<>();
        listOfQuestions.addAll(q.getQuestions());
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public ArrayList<Question> getQuestions(){
        return listOfQuestions;
    }
    public Question getQustionFromIndex(int i){
        return listOfQuestions.get(i);
    }
    public void addQuestion(Question q){
        listOfQuestions.add(q);
    }
    public void removeQuestion(Question q ){
        listOfQuestions.remove(q);
    }
    public void setQuestions(ArrayList<Question>l){
        listOfQuestions.addAll(l);
    }
    public int getNumberOfQuestions(){
        return listOfQuestions.size();
    }
    public int getNumberOfPoints(){
        int i = 0;
        for (Question q : listOfQuestions){
            i += q.getPoints();
        }
        return i;
    }
    public boolean isEqual(Quiz q){
        if (this.equals(q)){
            return true;
        }
        return false;
    }
}
