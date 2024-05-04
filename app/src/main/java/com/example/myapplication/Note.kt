package com.example.myapplication


data class Note (
    val id, val text: String, val time: Long = System.currentTimeMillis()
)

