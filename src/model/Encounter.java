/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Shiba
 */
public class Encounter {
    ArrayList<VitalSigns> vitalSignsDirectory;
    
    
    
    public ArrayList<VitalSigns> getVitalSignsDirectory() {
        return vitalSignsDirectory;
    }

    public void setVitalSignsDirectory(ArrayList<VitalSigns> vitalSignsDirectory) {
        this.vitalSignsDirectory = vitalSignsDirectory;
    }
    
    public VitalSigns createAndAddVitalSign() {
        VitalSigns vitalSign = new VitalSigns();
        vitalSignsDirectory.add(vitalSign);
        return vitalSign;
    }
    
    
}
