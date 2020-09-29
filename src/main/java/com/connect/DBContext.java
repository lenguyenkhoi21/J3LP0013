/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;

public class DBContext {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String username = "lenguyenkhoi21";
    public static final String password = "LeNguyenKhoi21";
    public static final String url = "jdbc:mysql://192.168.84.133:3306/J3.L.P0013?autoReconnect=true&useSSL=false";
    public static final String imgFolder = "image/";

//    InitialContext initCxt;
//    Context envirCxt;
//    String serverName;
//    String port;
//    String username;
//    String password;
//    String dbName;
//    String imgFolder;

    public DBContext() throws Exception {
//        initCxt = new InitialContext();
//        envirCxt = (Context) initCxt.lookup("java:/comp/env");
//        serverName = "192.168.84.133";
//        port = "3306";
//        username = "lenguyenkhoi21";
//        password = "LeNguyenKhoi21";
//        dbName = "J3.L.P0013";
//        imgFolder = "image/";

    }

    public Connection getConnection() throws Exception {
        Class.forName(DRIVER);
        return DriverManager.getConnection(url, username, password);
    }

    public void close(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
    
    public String getResource() throws Exception {
        return imgFolder;
    }

}
