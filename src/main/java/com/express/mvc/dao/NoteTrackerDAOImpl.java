package com.express.mvc.dao;


import com.express.mvc.entity.NoteEntity;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Slf4j
@Repository
public class NoteTrackerDAOImpl implements NoteTrackerDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void saveNote(int id, NoteEntity note) {
        note.setId(id);
        String sql = "insert into notes (id, title, content) values(\"" + id + "\",\"" + note.getTitle() + "\",\"" + note.getContent() + "\")";
        System.out.println(sql);
        jdbcTemplate.update(sql);
    }

    @Override
    public List<NoteEntity> findAll() {
        String sql = "select * from notes";
        List<NoteEntity> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(NoteEntity.class));
        return query;
    }
    
    @Override
    public NoteEntity getNoteById(int id){
        String sql = "select * from notes where id = ?";
        NoteEntity queryForRowSet = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<NoteEntity>(NoteEntity.class), id);
        return queryForRowSet;
    }
    
    @Override
    public int getLastNoteId(){
        String sql = "Select Max(id) from notes";
        Integer id = jdbcTemplate.queryForObject(sql, Integer.class);
        return id;
    }

    @Override
    public void updateNote(int id, NoteEntity note) {
        String sql = "UPDATE notes SET title = ?, content= ? WHERE id = ?";
        jdbcTemplate.update(sql, note.getTitle(), note.getContent(), id);
    }
}
