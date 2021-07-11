package com.example.easychef.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Recipe::class],
    exportSchema = false,
    version = 1
)
abstract class RecipeDatabase : RoomDatabase() {
    abstract val recipeDao: RecipeDao
}