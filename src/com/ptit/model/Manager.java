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
public class Manager extends Employee{
    private String managerID;
    private String account;
    private String password;

    public Manager() {
    }

    public Manager(String managerID, String account, String password) {
        this.managerID = managerID;
        this.account = account;
        this.password = password;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
