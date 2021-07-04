package com.pujol.Money.utils;

import java.sql.*;

public class DB {

    private Connection connection = null;

    public DB() throws Exception {

        String user = "mysql";
        String password="prac";
        String schema="bank";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost/"+schema+"?user="+user+"&password="+password);
    }

    public PreparedStatement prepareStatement(String query) throws SQLException{
        return connection.prepareStatement(query);
    }

    public void disconnectBD() throws SQLException{
        connection.close();
    }
}
