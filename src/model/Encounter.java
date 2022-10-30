/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Shubham Idekar
 */
public class Encounter {
    ArrayList<VitalSigns> vitalSignsDirectory;
    
    
    public ArrayList<VitalSigns> getVitalSignsDirectory() {
        return vitalSignsDirectory;
    }

    public void setVitalSignsDirectory(ArrayList<VitalSigns> vitalSignsDirectory) {
        this.vitalSignsDirectory = vitalSignsDirectory;
    }
    
}
