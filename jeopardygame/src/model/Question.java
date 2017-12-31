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
public class Question {
   

private int qID;
private int qType;
private String quest;

private String answer;
private int points;
private String conceptID;
private String category;
    public Question(){
        
    }
    public Question(Question q){
        setQuestion(q.getQuestion());
        setAnswer(q.getAnswer());
        
        setConcept(q.getConceptID());
        setID(q.getID());
        setPoints(q.getPoints());
        setQType(q.getQType());
    }
    public boolean isEqual(Question q){
        if (this.quest.equals(q.getQuestion())){
            return true;
        }
        else if (this.conceptID.equals(q.getConceptID())){
            return true;
        }
        else if (this.qID == q.getID()){
            return true;
        }
        else
            return false;
    }
    public String questionToString(){
       String r = "Question: " + quest;
       return r;
    }
    
    public String pointsToString(){
        String r = "Points: " + points;
        return r;
    }
    public String idToString(){
        String r = "Question ID: " + qID;
        return r;
    }
    
    public void setQuestion(String q){
        quest = q;
    }
    public String getQuestion(){
        return quest;
    }
    public void setAnswer(String a){
        answer  = a;
    }
    public String getAnswer(){
        return answer;
    }
    
    public void setConcept(String c){
        conceptID = c;
    }
    public String getConceptID(){
        return conceptID;
    }
    public void setID(int i){
        qID = i;
    }
    public int getID(){
        return qID;
    }
    public void setQType(int q){
        qType = q;
    }
    public int getQType(){
    return qType;
    }
    public void setPoints(int p){
        points = p;
    }
    public int getPoints(){
        return points;
    }
    public void setCategory(String s){
        this.category = s;
    }
    public String getCategory(){
        return this.category;
    }
}
