package com.example.mynoteapp.Database;

import android.content.Context;

import com.example.mynoteapp.Dao.NoteDao;
import com.example.mynoteapp.Entities.Note;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Note.class, version = 1, exportSchema = false)
public abstract class NotesDatabase extends RoomDatabase {
    private static  NotesDatabase notesDatabase;
    public static synchronized NotesDatabase getDatabase(Context context){
        if (notesDatabase == null){
            notesDatabase = Room.databaseBuilder(
                    context,
                    NotesDatabase.class,
                    "notes_db"
            ).build();
        }
        return notesDatabase;
    }

    public abstract NoteDao noteDao();

}
