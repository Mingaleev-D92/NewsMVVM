package com.example.newsmvvm.db

import androidx.room.TypeConverter
import com.example.newsmvvm.pojo.Source

/**
 * @author Mingaleev D. 05.07.2022
 **/
class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}