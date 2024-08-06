package com.express.mvc.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Slf4j
@Repository
public class NoteTrackerDAOImpl implements NoteTrackerDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public NoteTrackerDAOImpl(){}
    
    @Override
    public void saveNote() {
        String sql = "insert into notes values(2,\"Go\",\"ssssssssssssss\")";
        jdbcTemplate.update(sql);
        log.info("Good insertion.");
    }
}
