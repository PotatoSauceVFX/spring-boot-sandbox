package com.potatosaucevfx.springbootsandbox.controller;

// Home Controller
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView home() {
        
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("message", "TestMessage");
        return mav;
    }

}
