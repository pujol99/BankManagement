package com.pujol.Money.controllers;

import com.pujol.Money.models.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;

@WebServlet("/GetTransactionsMonth")
public class GetTransactionsMonth extends Base{
    public GetTransactionsMonth() { super(); }

    @Override
    public void doAction() throws ServletException, IOException {

        List<Transaction> transactions = moneyManager.getTransactionsMonth();
        request.setAttribute("transactions", transactions);

        String json = moneyManager.getTransactionsJson(transactions);
        request.setAttribute("json", json);

        redirect("transactionsListView.jsp");
    }

}

