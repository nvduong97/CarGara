/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.Service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUONGNV
 */
public class ServiceDAO {

    public List<Service> selectService(String key) {
        List<Service> services = null;
        String sql = "SELECT * FROM Service WHERE serviceName = N'" + key + "'";
        Connection connect = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            services = new ArrayList<Service>();
            ResultSet rs = stmt.executeQuery(sql);
            Service service = null;
            while (rs.next()) {
                service = new Service();
                service.setServiceID(rs.getString(1));
                service.setServiceName(rs.getString(2));
                service.setServicePrice(rs.getInt(3));
                services.add(service);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return services;
    }
}
