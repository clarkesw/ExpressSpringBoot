package com.express.mvc.dao;

import com.express.mvc.model.Note;
import java.util.List;


public interface NoteDAO {

	public void save(Note note);
	public List<Note> findAll();
}
