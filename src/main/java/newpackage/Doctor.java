/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author shiba
 */
public class Doctor {
    
    public String Name;
    public int Doc_ID;
    public String Resident_Hosp;
    public String qualification;
    public String specialization;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getDoc_ID() {
        return Doc_ID;
    }

    public void setDoc_ID(int Doc_ID) {
        this.Doc_ID = Doc_ID;
    }

    public String getResident_Hosp() {
        return Resident_Hosp;
    }

    public void setResident_Hosp(String Resident_Hosp) {
        this.Resident_Hosp = Resident_Hosp;
    }

    Object getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getPass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
