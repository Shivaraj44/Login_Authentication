package com.practical.shivarajkumarjane.database

import androidx.room.Dao
import androidx.room.Insert
@Dao
interface Dao {

    @Insert
    suspend fun insert(model: Model)
}