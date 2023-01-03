package com.shashi.servlet.coach;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CoachServlet {
    
    @RequestMapping("/")
    public String getCoachWelcome(){
        return "coach";
    }
    @RequestMapping("/welcome")
    public String getCoachWelcomebyName(@RequestParam("Student Name") String name, Model model){
        model.addAttribute("name", "Welcome to coaching school" + name);
        return "WelcomeCoach";
    }
}
