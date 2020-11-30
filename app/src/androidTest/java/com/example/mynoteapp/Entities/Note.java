package com.example.mynoteapp.Entities;

import java.io.Serializable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")

public class Note implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private  int id ;

    @ColumnInfo(name = "title")
    private  String title;

    @ColumnInfo(name = "datetime")
    private String datetime;

    @ColumnInfo(name = "notetext")
    private  String notetext;

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

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getNotetext() {
        return notetext;
    }

    public void setNotetext(String notetext) {
        this.notetext = notetext;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
