package com.express.mvc.service;

import com.express.mvc.dao.NoteTrackerDAO;
import com.express.mvc.entity.NoteEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NoteTrackerServiceImpl implements NoteTrackerService {
    private final NoteTrackerDAO noteDAO;

    public NoteTrackerServiceImpl(NoteTrackerDAO noteDAO) {
        this.noteDAO = noteDAO;
    }

    @Override
    public void save(NoteEntity note) {
        int id = getLastNoteId() + 1;
        noteDAO.saveNote(id, note);
    }

    @Override
    public List<NoteEntity> findAll() {
        //dao call
        List<NoteEntity> allNote = noteDAO.findAll();
        //client need 
        allNote.forEach(note -> note.setTitle(note.getTitle().toUpperCase()));
        return allNote;
    }   
    
    @Override
    public NoteEntity findById(int id){
        return noteDAO.getNoteById(id);
    }
    
    private int getLastNoteId(){
        return noteDAO.getLastNoteId();
    }

    @Override
    public void updateNote(int id, NoteEntity note) {
        noteDAO.updateNote(id, note);
    }
    
}
