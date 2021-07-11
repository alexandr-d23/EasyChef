package com.example.easychef.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val imageUrl: String,
    val ingredients: String,
    val instruction: String
)
