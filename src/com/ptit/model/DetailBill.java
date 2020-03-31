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
public class DetailBill {

    private int billID;
    private String DetailBill;
    private int amount;

    public DetailBill() {
    }

    public DetailBill(int billID, String DetailBill, int amount) {
        this.billID = billID;
        this.DetailBill = DetailBill;
        this.amount = amount;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public String getDetailBill() {
        return DetailBill;
    }

    public void setDetailBill(String DetailBill) {
        this.DetailBill = DetailBill;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
