package com.pujol.Money.managers;

import com.pujol.Money.utils.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Manager {

    protected DB db = null ;

    public Manager() {
        try {
            db = new DB();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void finalize() {
        try {
            db.disconnectBD();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void executeStatement(PreparedStatement statement) {
        try {
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();}
    }

    public void close(ResultSet rs, PreparedStatement statement) {
        try {
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();}
    }
}