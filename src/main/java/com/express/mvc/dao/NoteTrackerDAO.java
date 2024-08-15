package com.express.mvc.dao;

import com.express.mvc.entity.NoteEntity;
import java.util.List;


public interface NoteTrackerDAO {
    public void saveNote(int id, NoteEntity note);
    public List<NoteEntity> findAll();
    public NoteEntity getNoteById(int id);
    public int getLastNoteId();
    public void updateNote(int id, NoteEntity note); 
}
