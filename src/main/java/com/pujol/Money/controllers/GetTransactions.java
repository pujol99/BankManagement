package com.pujol.Money.controllers;

import com.pujol.Money.models.Transaction;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/GetTransactions")
public class GetTransactions extends Base{
    public GetTransactions() { super(); }

    @Override
    public void doAction() throws ServletException, IOException {

        List<Transaction> transactions = moneyManager.getTransactions();
        request.setAttribute("transactions", transactions);

        String json = moneyManager.getTransactionsJson(transactions);
        request.setAttribute("dataPoints", json);

        redirect("transactionsListView.jsp");
    }

}

