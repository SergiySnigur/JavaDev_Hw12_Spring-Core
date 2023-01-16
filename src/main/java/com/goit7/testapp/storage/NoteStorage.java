package com.goit7.testapp.storage;

import com.goit7.testapp.entities.Note;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@Service
public class NoteStorage {
    private Map<Long, Note> storage = new LinkedHashMap<>();
}
