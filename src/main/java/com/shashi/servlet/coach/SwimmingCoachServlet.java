package com.shashi.servlet.coach;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SwimmingCoachServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.setAttribute("coach", "Micheal Phelps");
        RequestDispatcher rd = req.getRequestDispatcher("/swimming-coach.jsp");
        rd.forward(req, res);
    }
}
