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
public class Accessories {
    private String accessoriesID;
    private String accessoriesName;
    private int accessoriesPrice;

    public Accessories() {
    }

    public Accessories(String accessoriesID, String accessoriesName, int accessoriesPrice) {
        this.accessoriesID = accessoriesID;
        this.accessoriesName = accessoriesName;
        this.accessoriesPrice = accessoriesPrice;
    }

    public String getAccessoriesID() {
        return accessoriesID;
    }

    public void setAccessoriesID(String accessoriesID) {
        this.accessoriesID = accessoriesID;
    }

    public String getAccessoriesName() {
        return accessoriesName;
    }

    public void setAccessoriesName(String accessoriesName) {
        this.accessoriesName = accessoriesName;
    }

    public int getAccessoriesPrice() {
        return accessoriesPrice;
    }

    public void setAccessoriesPrice(int accessoriesPrice) {
        this.accessoriesPrice = accessoriesPrice;
    }
}
