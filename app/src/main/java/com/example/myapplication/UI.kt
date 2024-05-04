package com.example.myapplication

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

class UI {
    @Composable
    fun noteScreen() {
        Scaffold(floatingActionButton = {
            FloatingActionButton(onClick = {
                viewModel.addNote() }){
                Icon(Icons.Filled.Add, contentDescription = "Add note")
            }
        }){
            NoteList(notes = viewModel.note, oneDeleteClicked = viewModel:: deleteNote)
        }
    }

    private @Composable
    fun NoteList(notes: List<Note>, oneDeleteClicked: (Note) -> Unit) {
        LazyColumn {
            items(notes) {
                note -> NoteItem(note = note, oneDeleteClicked = { oneDeleteClicked(note) })
            }
        }
    }

    private @Composable
    fun NoteItem(note: Int) {

    }
}