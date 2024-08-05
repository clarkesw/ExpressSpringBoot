package com.express.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HelloController {
    
    @Autowired
    ApplicationContext context;
    
    @ModelAttribute()
    public void namer(Model mod){
        mod.addAttribute("name","Double Cake Man");
    }
    
    @GetMapping("/hello")
    public String getMessage(RedirectAttributes reAtt){
        reAtt.addFlashAttribute("name", "Clarkiee");
        return "first";
    //    mod.addAttribute("name", "Clarkie");
  //      return "redirect:/real-hello";
    }
    
    @GetMapping("/real-hello")
    public String getMessages(Model mod){
  //      mod.addAttribute("name", "Clarkie");
        return "first";
    }    
    
    @ModelAttribute()
    @RequestMapping(value = "/tester")
    public String handleRequester (Model mod) {
        mod.addAttribute("name","Cake Man");
        return "first";
    }    
}
