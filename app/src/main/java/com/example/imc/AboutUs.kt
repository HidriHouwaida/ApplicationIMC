package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_about_us.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class AboutUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)
        log.setOnClickListener()
        {
            val gameactivity = Intent(this@AboutUs,SiginIn::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layout5.openDrawer(GravityCompat.START)
        }
        logout.setOnClickListener()
        {
            val g = Intent(this@AboutUs,Lougout::class.java)
            startActivity(g)
        }
        home.setOnClickListener()
        {
            val gameactivity = Intent(this@AboutUs,MainActivity::class.java)
            startActivity(gameactivity)
        }

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
            val g = Intent(this@AboutUs,Search::class.java)
            startActivity(g)}
    }
}