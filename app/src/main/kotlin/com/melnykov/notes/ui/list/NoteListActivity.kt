package com.melnykov.notes.ui.list

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import com.melnykov.notes.R
import com.melnykov.notes.ui.details.NoteDetailsActivity
import kotlinx.android.synthetic.main.activity_note_list.*


class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)

        text_take_note.setOnClickListener({
            startActivity(Intent(this, NoteDetailsActivity::class.java))
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.note_list, menu)
        return true
    }
}
