package com.express.mvc.entity;

import com.express.mvc.model.Note;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NoteEntity{
    
    @Id
    @GeneratedValue //(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;

    public NoteEntity() {
    }

    public NoteEntity(Note note) {
        this.title = note.getTitle();
        this.content = note.getDetails();
    }
    
    public NoteEntity(String title, String details) {
        this.title = title;
        this.content = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NoteEntity{" + "id=" + id + ", title=" + title + ", content=" + content + '}';
    }
}
