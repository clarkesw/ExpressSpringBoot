package com.express.mvc.controller;

import com.express.mvc.model.Note;
import com.express.mvc.service.NoteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class NoteTrackerController {
    
    private NoteService noteServ;

    public NoteTrackerController(NoteService noteServ) {
        this.noteServ = noteServ;
    }

    @GetMapping("/note-home")
    public String showNoteHome(Note note, Model model){
        model.addAttribute("name","Cool Clarke");
        noteServ.populateNotes();
        return "welcome";
    }
        
    @PostMapping("/note-submit")
    public String submitNote(Note note){
        noteServ.save(note);
        return "submitted-note";
    }   
    
    @GetMapping("/note-get-all")
    public String getNotes(Model model){    
        List<Note> notes = noteServ.getAll();
        model.addAttribute("notes", notes);
        return "show-all-notes";
    }
}
