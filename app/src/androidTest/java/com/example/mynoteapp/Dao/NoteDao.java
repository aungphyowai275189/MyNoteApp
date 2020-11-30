package com.example.mynoteapp.Dao;

import com.example.mynoteapp.Entities.Note;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface NoteDao {
    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Note>getAllNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Void insertNote(Note note);

    @Delete
    void deleteNote(Note note);

}
