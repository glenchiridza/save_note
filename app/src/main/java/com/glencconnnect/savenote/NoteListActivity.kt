package com.glencconnnect.savenote

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_note_list.*
import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(findViewById(R.id.toolbar))

        fab.setOnClickListener { view ->
           val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        listNotes.adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                DataManager.notes)

    }
}