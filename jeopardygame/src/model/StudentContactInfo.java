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
public class StudentContactInfo {
    private String address;
    private String phone;
    private String email;
    
    public StudentContactInfo (String a, String p, String e){
        this.address = a;
        this.phone = p;
        this.email = e;    
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public String toString(){
        String r = " \nAddress: " + getAddress() + " \nPhone: " + getPhone() + " \nEmail: " + getEmail();
        return r;
    }
}
