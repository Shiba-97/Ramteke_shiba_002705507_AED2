/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author shiba
 */
public class Patient {
    
    private String Username;
    //private String primaryDoctorName;
    //private String prefferedPharmacy;
    private VitalSignHistory vitalSignHistory;
    public String Pass;
    
    public Patient() {
        this.vitalSignHistory = new VitalSignHistory();
    }
    
    public String getPass(){
        return Pass;
      
    }
    public String getUsername() {
        return Username;
    }
    
    public void setPatientID(String Username) {
        this.Username = Username;
    }
    
    
    
    
    
    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.Username);
    }

    String getpUsername() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
