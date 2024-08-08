package com.express.mvc.service;

import com.express.mvc.dao.NoteDao;
import com.express.mvc.dao.NoteTrackerDAO;
import com.express.mvc.model.Note;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NoteTrackerServiceImpl implements NoteTrackerService {
    private NoteTrackerDAO noteDAO;

    public NoteTrackerServiceImpl(NoteTrackerDAO noteDAO) {
        this.noteDAO = noteDAO;
    }

    @Override
    public void save(Note note) {
        noteDAO.saveNote(note);
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
