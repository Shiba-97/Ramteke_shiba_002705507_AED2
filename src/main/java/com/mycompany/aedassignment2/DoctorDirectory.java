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
public class DoctorDirectory {
    public ArrayList<Doctor> docDirectory;
    
    
    public DoctorDirectory(){
            this.docDirectory = new ArrayList<>();
        }
    
    public Doctor addNewDoctor(Person person,String username,String pass){
        Doctor newDoc = new Doctor(person, username, pass);
        docDirectory.add(newDoc);
        return newDoc;
    }
    
    public void deleteDoc(Doctor doc){
        docDirectory.remove(doc);
    }
    
    public ArrayList<Doctor> getDocDirectory() {
        return docDirectory;
    }

    public void setDocDirectory(ArrayList<Doctor> docDirectory) {
        this.docDirectory = docDirectory;
    }
    
}
