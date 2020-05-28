package com.example.nordic_motorhome.Models;

public class Customer {
    private int idCustomers;
    private String fName;
    private String lName;
    private String Adress;
    private int phone_number;
    private String email;
    private String driverLicense;

    public Customer(int idCustomers, String fName, String lName, String adress, int phone_number, String email, String driverLicense) {
        this.idCustomers = idCustomers;
        this.fName = fName;
        this.lName = lName;
        Adress = adress;
        this.phone_number = phone_number;
        this.email = email;
        this.driverLicense = driverLicense;
    }

    public Customer() {
    }

    public int getIdCustomers() {
        return idCustomers;
    }

    public void setIdCustomers(int idCustomers) {
        this.idCustomers = idCustomers;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
}