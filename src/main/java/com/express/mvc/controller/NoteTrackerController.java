package com.express.mvc.controller;

import com.express.mvc.entity.NoteEntity;
import com.express.mvc.model.Note;
import com.express.mvc.service.NoteTrackerService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NoteTrackerController {
    private final NoteTrackerService noteTrackerService;

    public NoteTrackerController(NoteTrackerService noteTrackerService) {
        this.noteTrackerService = noteTrackerService;
    }
    
    @ResponseBody
    @RequestMapping(value = "/insert/{title}/{details}")
    public String saveNote(@PathVariable String title, @PathVariable String details) {
        noteTrackerService.save(new NoteEntity(title, details));
        return "Successful Insertion!!";
    }      

    @GetMapping(value = "/note-home")
    public String showNoteTrackerHomePage(@ModelAttribute Note note) {
        //note-submit
        return "welcome";
    }
    
    @PostMapping(value = "/note-submit")
    public String processNote(@Valid @ModelAttribute Note note, Errors error) {
        if(error.hasErrors()){
            error.getAllErrors().stream()
                    .forEach(System.out::println); //str -> System.out.println(str));
            return "redirect:/note-home";
        }
        
        noteTrackerService.save(new NoteEntity(note));
        return "submitted-note";
    }
    
    @PostMapping(value = "/note-update/{id}")
    public void updateNote(@PathVariable int id, NoteEntity note) {
        noteTrackerService.updateNote(id, note);
    }    

    @GetMapping("/find-all-notes")
    public String getAllNote(Model model){
        List<NoteEntity> allNotes = noteTrackerService.findAll();
        model.addAttribute("notes", allNotes);

        return "notes-all";
    }
}
