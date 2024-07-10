
package com.express.mvc.service;

import com.express.mvc.dao.NoteDao;
import com.express.mvc.model.Note;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class NoteServiceImpl implements NoteService {
    
   // @Autowired
    private NoteDao noteDao;

    @Autowired
    public NoteServiceImpl(NoteDao noteDao) {
        this.noteDao = noteDao;
    }
    
    @Override
    public void save(Note note) {
        noteDao.save(note);
        
    }

    @Override
    public List<Note> getAll() {
        List<Note> notes = noteDao.getAll();
        return notes;
    }

    @Override
    public void populateNotes() {
        noteDao.populateNotes();
    }
    
}
