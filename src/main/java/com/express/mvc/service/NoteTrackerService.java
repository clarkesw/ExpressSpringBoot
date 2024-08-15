package com.express.mvc.service;

import com.express.mvc.entity.NoteEntity;
import java.util.List;

public interface NoteTrackerService {
    public void save(NoteEntity note);
    public List<NoteEntity> findAll();
    public NoteEntity findById(int id); 
    public void updateNote(int id, NoteEntity note); 
}
