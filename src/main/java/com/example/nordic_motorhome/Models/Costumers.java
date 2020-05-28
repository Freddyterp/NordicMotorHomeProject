package com.example.nordic_motorhome.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Costumers {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int PhoneNumber;
    private String Email;
    private String driverLicenseNumber;

    public Costumers(int id, String firstName, String lastName, int phoneNumber, String email, String driverLicenseNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        PhoneNumber = phoneNumber;
        Email = email;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public Costumers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }
}
