package com.express.mvc.controller;


import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NoteTrackerController {
    
    @GetMapping("/note-home")
    public String showNoteHome(Model model){
        model.addAttribute("name","Cool Clarke");
        return "welcome";
    }
}
