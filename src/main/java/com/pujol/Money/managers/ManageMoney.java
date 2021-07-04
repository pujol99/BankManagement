package com.pujol.Money.managers;


import com.google.gson.Gson;
import com.pujol.Money.models.Transaction;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class ManageMoney extends Manager {

    public ManageMoney() {
        super();
    }

    public List<Transaction> getTransactions(){

        List<Transaction> transactions = new ArrayList<>();

        try {
            PreparedStatement statement = db.prepareStatement(
                    "SELECT * FROM transactions ORDER BY date ASC;");

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                transactions.add(fillTransaction(rs));}


            close(rs, statement);
        } catch (SQLException e) {
            e.printStackTrace();}

        return transactions;
    }

    public List<Transaction> getTransactionsMonth(){

        List<Transaction> transactions = new ArrayList<>();

        try {
            PreparedStatement statement = db.prepareStatement(
                    "SELECT * FROM bank.transactions WHERE MONTH(date) = MONTH(curdate()) ORDER BY date ASC;");

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                transactions.add(fillTransaction(rs));}


            close(rs, statement);
        } catch (SQLException e) {
            e.printStackTrace();}

        return transactions;
    }

    public Transaction fillTransaction(ResultSet rs){
        Transaction transaction = new Transaction();

        try{

            transaction.setConcept(rs.getString("concept"));
            transaction.setSec_concept(rs.getString("sec_concept"));
            transaction.setValue(rs.getFloat("value"));
            transaction.setTotal_money(rs.getFloat("total_money"));
            transaction.setDate(rs.getDate("date"));

        } catch (SQLException e) {
            e.printStackTrace();}

        return transaction;
    }

    public String getTransactionsJson(List<Transaction> transactions){
        Gson gsonObj = new Gson();
        Map<Object,Object> map = null;
        List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
        int i = 0;
        for (Transaction t : transactions) {
            map = new HashMap<Object,Object>();

            map.put("x", t.getDate().getMonth());
            map.put("y", t.getTotal_money());

            list.add(map);
        }

        return gsonObj.toJson(list);
    }



}