package com.shashi.servlet.coach;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FootballCoachServlet {
    
    @RequestMapping("/football")
    public String getCoachWelcome(HttpServletRequest req){
        req.setAttribute("name", "Maradona");
        return "football-coach";
    }
}