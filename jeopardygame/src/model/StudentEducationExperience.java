/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alive
 */
public class StudentEducationExperience {
    private String school;
    private String beginDate;
    private String endDate;
    private String major;
    private String degree;
    
    public StudentEducationExperience(){
        
    }
    public StudentEducationExperience(String s, String b, String e, String m, String d){
        school = s; beginDate = b; endDate = e; major = m; degree = d;
        
    }
    public String getSchool(){
        return school;
    }
    public String getBeginDate(){
        return beginDate;
    }
    public String getEndDate(){
        return this.endDate;
    }
    public String getMajor(){
        return this.major;
    }
    public String getDegree(){
        return this.degree;
    }
    public String toString(){
        String r = " \nSchool: " + getSchool() + " \nStart Date: " + getBeginDate() + " \nEnd Date: " + getEndDate() + " \nMajor: "+ getMajor() + " \nDegree: "+ getDegree();
        return r;
    }
}
