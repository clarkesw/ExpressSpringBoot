package com.express.mvc.service;

import com.express.mvc.dao.NoteDAO2;
import com.express.mvc.model.Note;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NoteTrackerServiceImpl implements NoteTrackerService {
    private final NoteDAO2 noteDAO;

    public NoteTrackerServiceImpl(NoteDAO2 noteDAO) {
        this.noteDAO = noteDAO;
    }

    @Override
    public void save(Note note) {
        noteDAO.save(note);
    }

    @Override
    public List<Note> findAll() {
        List<Note> allNote = noteDAO.findAll();

        allNote.forEach(note -> note.setTitle(note.getTitle().toUpperCase()));
        return allNote;
    }    
}
