package com.express.mvc.dao;

import com.express.mvc.model.Note;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class NoteDAOImpl implements NoteDAO2 {

    ArrayList<Note> noteList = new ArrayList<>();

    @Override
    public void save(Note note) {
        noteList.add(note);
        System.out.println("note saved to list..");
    }

    @Override
    public List<Note> findAll() {
        return noteList;
    }
}
