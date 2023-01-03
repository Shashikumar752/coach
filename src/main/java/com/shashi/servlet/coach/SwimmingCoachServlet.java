package com.shashi.servlet.coach;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SwimmingCoachServlet {
    
    @RequestMapping("/swimming")
    public String getCoachWelcome(HttpServletRequest req){
        req.setAttribute("name", "Micheal Phelps");
        return "swimming-coach";
    }
}
