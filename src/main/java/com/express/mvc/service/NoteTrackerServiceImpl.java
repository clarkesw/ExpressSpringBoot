package com.express.mvc.service;

import com.express.mvc.dao.NoteDAO;
import com.express.mvc.model.Note;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NoteTrackerServiceImpl implements NoteTrackerService {
    private NoteDAO noteDAO;

    public NoteTrackerServiceImpl(NoteDAO noteDAO) {
        this.noteDAO = noteDAO;
    }

    @Override
    public void save(Note note) {
        noteDAO.save(note);
    }

    @Override
    public List<Note> findAll() {
        //dao call
        List<Note> allNote = noteDAO.findAll();
        //client need 
        allNote.forEach(note -> note.setTitle(note.getTitle().toUpperCase()));
        return allNote;
    }    
}
