package com.shashi.servlet.coach;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CricketCoachServlet  {
    
    @RequestMapping("/cricket")
    public String getCoachWelcome(HttpServletRequest req){
        req.setAttribute("name", "Rahul Dravid");
        return "cricket-coach";
    }
    
}
