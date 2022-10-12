package com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNotes
)
