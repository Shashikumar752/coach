package com.shashi.servlet.coach;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CricketCoachServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.setAttribute("coach", "gary cirsten");
        RequestDispatcher rd = req.getRequestDispatcher("/cricket-coach.jsp");
        rd.forward(req, res);
    }
}
