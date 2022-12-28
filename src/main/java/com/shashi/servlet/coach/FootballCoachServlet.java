package com.shashi.servlet.coach;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FootballCoachServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.setAttribute("coach", "Zidane");
        RequestDispatcher rd = req.getRequestDispatcher("/football-coach.jsp");
        rd.forward(req, res);
    }
}