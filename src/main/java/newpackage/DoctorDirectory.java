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
public class DoctorDirectory {
     private List<Doctor> DoctorDirectory;

    public DoctorDirectory() {
        DoctorDirectory = new ArrayList<>();
    }
    

    public List<Doctor> getDoctorDirectory() {
        return DoctorDirectory;
    }

    public void setDoctorDirectory(List<Doctor> DoctorDirectory) {
        this.DoctorDirectory = DoctorDirectory;
    }
   

   

    public Doctor addDoctor() {
        Doctor d = new Doctor();
        DoctorDirectory.add(d);
        return d;
    }

    public void removeDoctor(Doctor d) {
        DoctorDirectory.remove(d);
    }

    public Doctor searchDoctor(String Username, String Pass) {
        for (Doctor Doc : DoctorDirectory) {
            if (Doc.getUsername().equals(Username) && Doc.getPass().equals(Pass)) {
                return Doc;
            }
            
        }
        return null;
    }
    
}
