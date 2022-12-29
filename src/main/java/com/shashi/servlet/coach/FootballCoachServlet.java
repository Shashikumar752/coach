package com.shashi.servlet.coach;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FootballCoachServlet {
    
    @RequestMapping("/football")
    public String getCoachWelcome(){
        return "football-coach";
    }
}