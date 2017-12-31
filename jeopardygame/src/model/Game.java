
package model;
import java.util.ArrayList;

public class Game {
    private int gameType;
    private int numTries;
    private Quiz quiz;
    private ArrayList<Student>listStudents;
    
    public Game(){
        
    }
    public Game(int g,int n, Quiz q, ArrayList<Student>l){
        listStudents = new ArrayList<>();
        this.gameType = g;
        this.numTries = n;
        this.quiz = q;
        this.listStudents.addAll(l);
    }
    public void addStudents(ArrayList<Student> l){
        listStudents = new ArrayList<>();
        listStudents.addAll(l);
    }
    public ArrayList<Student> getStudents(){
        return listStudents;
    }
    public void addStudent(Student s){
        listStudents.add(s);
    }
    public void setQuiz(Quiz q){
        this.quiz = q;
    }
    public Quiz getQuiz(){
        return quiz;
    }
    public int getNumTries(){
        return numTries;
    }
}
