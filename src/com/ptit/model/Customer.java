/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.model;

/**
 *
 * @author DUONGNV
 */
public class Customer {

    private int customerID;
    private String fullName;
    private String address;
    private String phone;
    private String birthDate;
    private String note;

    public Customer() {
        super();
    }

    public Customer(int customerID, String fullName, String address, String phone, String birthDate, String note) {
        this.customerID = customerID;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
        this.note = note;
    }
    
    

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

   
}
