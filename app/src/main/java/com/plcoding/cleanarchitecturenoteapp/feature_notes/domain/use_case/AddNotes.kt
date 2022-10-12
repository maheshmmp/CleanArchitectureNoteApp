package com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.model.InvalidNoteException
import com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.repository.NoteRepository

class AddNotes(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("Invalid title")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("Invalid content")
        }
        repository.insertNote(note)
    }
}