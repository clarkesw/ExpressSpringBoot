package com.express.mvc.service;

import com.express.mvc.model.Note;
import java.util.List;

public interface NoteTrackerService {
    public void save(Note note);
    public List<Note> findAll();   
}
