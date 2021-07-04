package com.pujol.Money.controllers;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/MainController")
public class MainController extends Base {
    public MainController() { super(); }

    @Override
    public void doAction() throws ServletException, IOException  {

        request.setAttribute("content", "button.jsp");
        redirect("index.jsp");
    }

}