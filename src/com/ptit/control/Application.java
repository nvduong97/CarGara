/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.control;

import com.ptit.view.LoginView;

/**
 *
 * @author DUONGNV
 */
public class Application {
     public static void main(String[] args) {
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        loginView.setTitle("Đăng nhập");
    }
}
