/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Shubham Idekar
 */
public class VitalSigns {
    private int bloodpressureupper;
    private int bloodpressurelower;
    private int heartrate; 
    private double temperature;
    private String date; 
    private String time;

    public int getBloodpressureupper() {
        return bloodpressureupper;
    }

    public void setBloodpressureupper(int bloodpressureupper) {
        this.bloodpressureupper = bloodpressureupper;
    }

    public int getBloodpressurelower() {
        return bloodpressurelower;
    }

    public void setBloodpressurelower(int bloodpressurelower) {
        this.bloodpressurelower = bloodpressurelower;
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
