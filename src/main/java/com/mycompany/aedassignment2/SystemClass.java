/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aedassignment2;

import java.util.ArrayList;

/**
 *
 * @author shiba
 */
public class SystemClass {
     public ArrayList<Admin> adminDirectory;
    
    public SystemClass(){
            this.adminDirectory = new ArrayList<Admin>();
        }
    public Admin addNewAdmin(Person person,String username,String password){
        Admin newAdm = new Admin(person, username, password);
        adminDirectory.add(newAdm);
        return newAdm;
    }
    
    public ArrayList<Admin> getAdminDirectory() {
        return adminDirectory;
    }

    public void setAdminDirectory(ArrayList<Admin> adminDirectory) {
        this.adminDirectory = adminDirectory;
    }
}
