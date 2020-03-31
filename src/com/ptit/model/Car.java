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
public class Car {

    private int carID;
    private int customerID;
    private String license;
    private String model;
    private String maker;
    private String note;

    public Car() {
    }

    public Car(int carID, int customerID, String license, String model, String maker, String note) {
        this.carID = carID;
        this.customerID = customerID;
        this.license = license;
        this.model = model;
        this.maker = maker;
        this.note = note;
    }
    

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
