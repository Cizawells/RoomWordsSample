package com.wells.roomwordssample;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
     void insert(Word word);

    @Query("DELETE FROM words_table")
    void deleteAll();

    @Query("SELECT * FROM words_table")
    LiveData<List<Word>> getAll();
}
