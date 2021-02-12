package com.practical.shivarajkumarjane.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Model::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase() {

    abstract val Dao: Dao

    companion object {

        private var INSTANCE: com.practical.shivarajkumarjane.database.Database? = null

        fun getInstance(context: Context): com.practical.shivarajkumarjane.database.Database {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance =
                        Room.databaseBuilder(context, com.practical.shivarajkumarjane.database.Database::class.java, "Users_DB").build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}