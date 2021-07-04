package com.pujol.Money.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pujol.Money.managers.ManageMoney;

public class Base extends HttpServlet{
    protected static final long serialVersionUID = 1L;

    protected ManageMoney moneyManager = null;

    protected HttpSession session = null;
    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public Base() { super(); }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        init(request,response);

        doAction();

        finalize();
    }

    public void init(HttpServletRequest request, HttpServletResponse response){
        session = request.getSession(false);

        moneyManager = new ManageMoney();

        this.request = request;
        this.response = response;

        System.out.println(getClass().getSimpleName());
    }

    public void finalize(){
        moneyManager.finalize();
    }

    public void doAction() throws ServletException, IOException {}

    public void redirect(String view) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher(view);
        dispatcher.forward(request,response);

        System.out.println("Forwarding to " + view);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
