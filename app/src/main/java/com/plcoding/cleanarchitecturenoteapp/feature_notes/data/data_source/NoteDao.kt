package com.plcoding.cleanarchitecturenoteapp.feature_notes.data.data_source

import androidx.room.*
import com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes() : Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNotesById(id : Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note : Note)

    @Delete
    suspend fun delete(note : Note)

}