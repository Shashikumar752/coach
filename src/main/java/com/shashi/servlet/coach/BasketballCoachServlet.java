package com.shashi.servlet.coach;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basketball")
public class BasketballCoachServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.setAttribute("coach", "Kobe Bryant");
        RequestDispatcher rd = req.getRequestDispatcher("/basketball-coach.jsp");
        rd.forward(req, res);
    }
}
