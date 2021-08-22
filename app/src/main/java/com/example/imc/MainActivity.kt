package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        men.setOnClickListener()
        {
            drawer_layout.openDrawer(GravityCompat.START)
        }
        log.setOnClickListener()
        {
            val gameactivity = Intent(this@MainActivity,SiginIn::class.java)
            startActivity(gameactivity)
        }
        logout.setOnClickListener()
        {
            val g =Intent(this@MainActivity,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g =Intent(this@MainActivity,AboutUs::class.java)
            startActivity(g)}
        set.setOnClickListener()
        {
            val g =Intent(this@MainActivity,Setting::class.java)
            startActivity(g)
        }
        shar.setOnClickListener()
        {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            val body = "Download this App"
            val sub = "http://play.google.com"
            intent.putExtra(Intent.EXTRA_TEXT, body)
            intent.putExtra(Intent.EXTRA_TEXT, sub)
            startActivity(Intent.createChooser(intent, "Partager avec "))
        }
        srch.setOnClickListener()
        {
            val g =Intent(this@MainActivity,Search::class.java)
            startActivity(g)
        }

    }
}