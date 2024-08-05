package com.express.mvc.controller;

import com.express.mvc.model.Note;
import com.express.mvc.service.NoteTrackerService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteTrackerController {
    private final NoteTrackerService noteTrackerService;

    public NoteTrackerController(NoteTrackerService noteTrackerService) {
        this.noteTrackerService = noteTrackerService;
    }

    @GetMapping(value = "/note-home")
    public String showNoteTrackerHomePage(@ModelAttribute Note note) {
        //note-submit
        return "welcome";
    }

    @PostMapping(value = "/note-submit")
    public String processNote(@Valid @ModelAttribute Note note, Errors error) {
        //take the note data 
        
        if(error.hasErrors()){
            error.getAllErrors().stream()
                    .forEach(System.out::println); //str -> System.out.println(str));
            
            return "redirect:/note-home";
        }
        
        noteTrackerService.save(note);
        return "submitted-note";
    }

    @GetMapping("/find-all-notes")
    public String getAllNote(Model model){
        //get all the note
        List<Note> allNotes = noteTrackerService.findAll();
        //send all the notes to view
        model.addAttribute("notes", allNotes);

        return "notes-all";
    }
}
