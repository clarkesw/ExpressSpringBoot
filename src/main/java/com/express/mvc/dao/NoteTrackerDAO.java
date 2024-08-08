package com.express.mvc.dao;

import com.express.mvc.model.Note;
import java.util.List;


public interface NoteTrackerDAO {
    public void saveNote(Note note);
    public List<Note> findAll();
}
