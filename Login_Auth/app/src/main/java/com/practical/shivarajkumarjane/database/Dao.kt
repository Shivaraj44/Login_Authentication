package com.practical.shivarajkumarjane.database

import androidx.annotation.NonNull
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface Dao {

    @Insert
    suspend fun insert(model: Model)


    @NonNull
    @Query("Select * FROM Login Where Mobile_no = :mobile and Password= :password")
     fun  login(mobile: String,password: String):LiveData<Model>


}