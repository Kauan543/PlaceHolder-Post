package com.example.placeholder

data class Post(
    val userId: Int,
    val id: Int? = null, // O ID será gerado automaticamente no POST
    val title: String,
    val body: String
)