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
public class Student {
    private String name;
    private String id;
    private StudentContactInfo info;
    private StudentEducationExperience eduExp;
    
    public Student(){
        name = "";
        id = "";
        
        
    }
    public Student(String n, String i){
        name = n;
        id = i;
        
    }
    public void setName(String s){
        name = s;
    }
    public void setID(String s){
        id = s;
    }
    public void setContactInfo(String a, String p, String e){
        info = new StudentContactInfo(a,p,e);
    }
    public StudentContactInfo getContact(){
        return info;
    }
    public void setEduExp(String school, String begin, String end, String major, String degree){
        eduExp = new StudentEducationExperience(school,begin,end,major,degree);
    }
    public StudentEducationExperience getExp(){
        return eduExp;
    }
    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
    public String toString(){
        String r = " \nName: " + getName() + " \nID: " + getID() + info.toString() + eduExp.toString();
        return r;
    }

}
