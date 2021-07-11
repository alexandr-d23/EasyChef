package com.example.easychef.data

import android.content.Context
import androidx.room.Room

class RecipeRepository(context: Context) {

    private var dao: RecipeDao = Room.databaseBuilder(
        context,
        RecipeDatabase::class.java,
        "db"
    ).allowMainThreadQueries().build().recipeDao

    fun addRecipe(recipe: Recipe) = dao.addRecipe(recipe)

    fun getRecipes(): List<Recipe> = dao.getRecipes()

    fun deleteRecipe(id: Int) = dao.deleteRecipe(id)

}