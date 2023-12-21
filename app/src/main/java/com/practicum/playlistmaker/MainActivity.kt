package com.practicum.playlistmaker

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById<Button>(R.id.search_button)
        val settingsButton = findViewById<Button>(R.id.settings_button)
        val mediatekaButton = findViewById<Button>(R.id.mediateka_button)

        settingsButton.setOnClickListener{ it ->
            val displayIntent = Intent(this, SettingsActivity::class.java)
            startActivity(displayIntent)
        }

        searchButton.setOnClickListener{
            val displayIntent = Intent(this, SearchActivity::class.java)
            startActivity(displayIntent)
        }

        mediatekaButton.setOnClickListener{
            val displayIntent = Intent(this, MediatekaActivity::class.java)
            startActivity(displayIntent)
        }

    }
}