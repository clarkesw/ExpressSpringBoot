package com.express.mvc.dao;

import com.express.mvc.model.Note;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Slf4j
@Repository
public class NoteTrackerDAOImpl implements NoteTrackerDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void saveNote(Note note) {
        String sql = "insert into notes values(1,\"Stop\",\"aaaaaaaaaaaaaaaa\")";
        jdbcTemplate.update(sql);
    }

    @Override
    public List<Note> findAll() {
        return null;
    }
    
    
}
