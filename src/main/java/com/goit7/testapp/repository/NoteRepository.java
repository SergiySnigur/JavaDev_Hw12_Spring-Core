package com.goit7.testapp.repository;

import com.goit7.testapp.entities.Note;

import java.util.List;

public interface NoteRepository {
    Note add(Note note);

    Note getById(long id);

    List<Note> listAll();

    void update(Note note);

    void deleteById(long id);

}
