/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shiba
 */
  
public class PatientDirectory {
    private List<Patient> PatientDirectory;

    public PatientDirectory() {
        PatientDirectory = new ArrayList<>();
    }
    

    public List<Patient> getPatientDirectory() {
        return PatientDirectory;
    }

    public void setPatientDirectory(List<Patient> PatientDirectory) {
        this.PatientDirectory = PatientDirectory;
    }
   

   

    public Patient addPatient() {
        Patient p = new Patient();
        PatientDirectory.add(p);
        return p;
    }

    public void removePatient(Patient p) {
        PatientDirectory.remove(p);
    }

    public Patient searchPatient(String Username, String Pass) {
        for (Patient patient : PatientDirectory) {
            if (patient.getUsername().equals(Username) && patient.getPass().equals(Pass)) {
                return patient;
            }
            
        }
        return null;
    }
}
    

