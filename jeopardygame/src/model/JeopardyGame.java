/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
public class JeopardyGame extends Game{
    
    private int numCols; // categories
    private int numRows; // questions
    private ArrayList<String>categoryTitles;
    
    public JeopardyGame(){
        
    }
    public JeopardyGame(int numCols, int numRows){
        this.numCols = numCols;
        this.numRows = numRows;
        
    }
    public JeopardyGame(int numCols, int numRows, ArrayList<String>catTitles){
        this.numCols = numCols;
        this.numRows = numRows;
        this.categoryTitles = new ArrayList<>();
        this.categoryTitles.addAll(catTitles);
    }
    public int getNumCols(){
        return numCols;
    }
    public int getNumRows(){
        return numRows;
    }
    public ArrayList<String> getCategoryTitles(){
        return categoryTitles;
    }
    public void addTitle(String s){
        this.categoryTitles.add(s);
    }
    
    
    
}
