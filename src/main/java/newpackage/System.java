/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author shiba
 */
public class System {
    PatientDirectory newPatient;
    PersonDirectory newPerson;
    DoctorDirectory newDoctor;
   // City city;

    public System(){
        newPerson = new PersonDirectory();
        newPatient = new PatientDirectory();
        newDoctor = new DoctorDirectory();
        
    }
    
    public PersonDirectory getNewPersonDirectory()
    {
    return newPerson;
    
}
 public PatientDirectory getNewPatientDirectory()
 {
     return newPatient;
     
 }
 
public DoctorDirectory getNewDoctorDirectory()
 {
     return newDoctor;
     
 }
 
public void setNewPerson(PersonDirectory newPerson) {
    this.newPerson = newPerson;
}


public void setNewPatient(PatientDirectory newPatient) {
    this.newPatient = newPatient;
}


public void setNewDoctor(DoctorDirectory newDoctor) {
    this.newDoctor = newDoctor;
}

}