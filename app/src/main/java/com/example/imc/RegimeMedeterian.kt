package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_regime_medeterian.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class RegimeMedeterian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regime_medeterian)
        logout.setOnClickListener()
        {
            val g = Intent(this@RegimeMedeterian,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g = Intent(this@RegimeMedeterian,AboutUs::class.java)
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
            val g = Intent(this@RegimeMedeterian,Search::class.java)
            startActivity(g)
        }
        home.setOnClickListener()
        {
            val g = Intent(this@RegimeMedeterian,MainActivity::class.java)
            startActivity(g)
        }
        men.setOnClickListener()
        {
            drawer_layoutRegimeMediterian.openDrawer(GravityCompat.START)
        }
        regimmediterian.setOnClickListener()
        {
            val g = Intent(this@RegimeMedeterian,ProgrammeMedeterian::class.java)
            startActivity(g)
        }
    }
}