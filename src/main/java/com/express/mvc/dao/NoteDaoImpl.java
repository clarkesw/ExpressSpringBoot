package com.express.mvc.dao;

import com.express.mvc.model.Note;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

//@Repository
public class NoteDaoImpl implements NoteDao{
     ArrayList<Note> notes = new ArrayList<>();

    @Override
    public void save(Note note) {
        System.out.println("~~~ Note: " + note.getTitle() + " Saved");
        notes.add(note);
    }

    @Override
    public List<Note> getAll() {
        System.out.println("~~~ Get All Notes ");
        return notes;
    }
    
    @Override
    public void populateNotes(){
        notes.add(new Note("One", "JSP Standard Tag Library"));
        notes.add(new Note("Two", "ConditionEvaluationDeltaLoggingListener"));
        notes.add(new Note("Three", "com.express.mvc.MvcApplication"));
    }
}
