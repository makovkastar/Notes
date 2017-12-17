package com.melnykov.notes.ui.list

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import com.melnykov.notes.R

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.note_list, menu)
        return true
    }
}
