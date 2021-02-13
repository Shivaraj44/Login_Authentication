package com.practical.shivarajkumarjane.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Login")
data class Model(
    @PrimaryKey(autoGenerate = true)
    var Id: Int = 0,

    @ColumnInfo(name = "First name")
    val Firstname: String,

    @ColumnInfo(name = "Last name")
    val Lastname: String,

    @ColumnInfo(name = "Mobile_no")
    val Mobileno: String,

    @ColumnInfo(name = "Email")
    val Email: String,


    @ColumnInfo(name = "Gender")
    val Gender: String,

    @ColumnInfo(name = "Password")
    val Password: String

)