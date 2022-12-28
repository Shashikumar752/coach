package com.shashi.servlet.coach;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CoachServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String coachingType = (String) req.getAttribute("coaching type");
        String url;
        switch (coachingType) {
            case "cricket":
                url="/coach/cricket/";
                break;
            case "football":
                url="/coach/football/";
                break;
            case "swimming":
                url="/coach/swimming/";
                break;
            default:
                url="/coach";
                break;
        }
        RequestDispatcher rd = req.getRequestDispatcher(url);
        rd.forward(req, res);
    }
    
}
