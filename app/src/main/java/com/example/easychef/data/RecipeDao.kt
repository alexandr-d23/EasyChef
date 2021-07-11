package com.example.easychef.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RecipeDao {

    @Insert
    fun addRecipe(recipe: Recipe)

    @Query("SELECT * FROM Recipe")
    fun getRecipes(): List<Recipe>

    @Query("DELETE FROM RECIPE WHERE id = :id")
    fun deleteRecipe(id: Int)

}