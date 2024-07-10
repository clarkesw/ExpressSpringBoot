package com.express.mvc.model;


public class Note {
    private String title;
    private String data;
    
    public Note() {
        this.title = "Add Title";
        this.data = "Add Note Data";
    }

    public Note(String title, String data) {
        this.title = title;
        this.data = data;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Note{" + "title=" + title + ", data=" + data + '}';
    }
}
