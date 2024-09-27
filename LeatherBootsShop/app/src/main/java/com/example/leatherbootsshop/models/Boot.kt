package com.example.leatherbootsshop.models

data class Boot(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String,
    val image: String = ""
)
