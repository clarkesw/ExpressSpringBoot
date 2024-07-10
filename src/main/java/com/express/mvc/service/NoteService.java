package com.express.mvc.service;

import com.express.mvc.model.Note;
import java.util.List;


public interface NoteService {
    public void save(Note note);
    public List<Note> getAll();
    public void populateNotes();
}
