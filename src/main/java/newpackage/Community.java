/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author shiba
 */
public class Community {
    private String communityName;
    private PatientCatalog patientCatalog;

    public Community() {
        patientCatalog = new PatientCatalog();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public PatientCatalog getPatientCatalog() {
        return patientCatalog;
    }

    public void setPatientCatalog(PatientCatalog patientCatalog) {
        this.patientCatalog = patientCatalog;
    }

    @Override
    public String toString() {
        return communityName; 
    }

    
}
