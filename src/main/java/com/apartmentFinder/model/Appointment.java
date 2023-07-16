package com.apartmentFinder.model;

import javax.persistence.*;

@Entity
@Table(name = "Appointment")
public class Appointment {

    @Id
    @Column(name = "appointmentid")
    @GeneratedValue
    private int appointmentid;

    @Column(name = "apartmentid")
    private int apartmentid;

    @Column(name = "userid")
    private int userid;

    @Column(name = "appointmentdate")
    private String appointmentdate;

    @Column(name = "appointmenttime")
    private String appointmenttime;

    public int getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(int appointmentid) {
        this.appointmentid = appointmentid;
    }

    public int getApartmentid() {
        return apartmentid;
    }

    public void setApartmentid(int apartmentid) {
        this.apartmentid = apartmentid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getAppointmentdate() {
        return appointmentdate;
    }

    public void setAppointmentdate(String appointmentdate) {
        this.appointmentdate = appointmentdate;
    }

    public String getAppointmenttime() {
        return appointmenttime;
    }

    public void setAppointmentTime(String appointmenttime) {
        this.appointmenttime = appointmenttime;
    }


}
