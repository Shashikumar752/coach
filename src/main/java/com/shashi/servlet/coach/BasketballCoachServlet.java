package com.shashi.servlet.coach;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BasketballCoachServlet  {

    @RequestMapping("/basketball")
    public String getCoachWelcome(){
        return "basketball-coach";
    }
}
