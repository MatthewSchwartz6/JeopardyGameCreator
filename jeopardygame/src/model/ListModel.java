/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
/**
 *
 * @author alive
 */
public class ListModel extends DefaultListModel{
    public ListModel(){
            super();          
    }
    
    public ListModel(ArrayList<Student> list){
            super();
            this.addElement(list);
            
    }
    public void addElement(Student s){
	super.addElement(s);
    }
    public void addElement(JeopardyGame g){
        super.addElement(g);
    }
    public void addElement(String q){
        super.addElement(q);
    }
}
