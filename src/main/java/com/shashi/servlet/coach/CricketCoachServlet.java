package com.shashi.servlet.coach;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CricketCoachServlet  {
    
    @RequestMapping("/cricket")
    public String getCoachWelcome(){
        return "cricket-coach";
    }
    
}
