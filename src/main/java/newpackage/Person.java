/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author shiba
 */
public class Person {
     private String personName;
    private int age;
    private Patient patient;
    private String Email;
    private String City;
    private String Community;
    private String HouseNo;
    private String Cellno;

    public String getCellno() {
        return Cellno;
    }

    public void setCellno(String Cellno) {
        this.Cellno = Cellno;
    }

    public String getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(String HouseNo) {
        this.HouseNo = HouseNo;
    }
    

    public Person() {
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }
    
    
    public String getPersonName() {
        return personName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
   
    
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString()
    {
        return this.personName;
    }

}
