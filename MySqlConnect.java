package com.nujkram.jdbc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author nujkram
 */
public class MySqlConnect {
    Connection myConn = null;
    public static Connection ConnectDB() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrecords", "root","admin");
            return myConn;
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, exc);
            return null;
        }
    }
}