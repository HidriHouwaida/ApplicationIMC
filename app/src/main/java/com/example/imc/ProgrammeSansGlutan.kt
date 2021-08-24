package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_programme_sans_glutan.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class ProgrammeSansGlutan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programme_sans_glutan)
        men.setOnClickListener()
        {
            drawer_layoutProgramRegimSansGlutan.openDrawer(GravityCompat.START)
        }
        logout.setOnClickListener()
        {
            val g = Intent(this@ProgrammeSansGlutan,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g = Intent(this@ProgrammeSansGlutan,AboutUs::class.java)
            startActivity(g)}

        shar.setOnClickListener()
        {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            val body = "Download this App"
            val sub = "http://play.google.com"
            intent.putExtra(Intent.EXTRA_TEXT, body)
            intent.putExtra(Intent.EXTRA_TEXT, sub)
            startActivity(Intent.createChooser(intent, "Partager avec"))
        }
        srch.setOnClickListener()
        {
            val g = Intent(this@ProgrammeSansGlutan,Search::class.java)
            startActivity(g)
        }
        home.setOnClickListener()
        {
            val g = Intent(this@ProgrammeSansGlutan,MainActivity::class.java)
            startActivity(g)
        }
    }
}