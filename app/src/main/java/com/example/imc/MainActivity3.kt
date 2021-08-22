package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        home.setOnClickListener()
        {
            val gameactivity =Intent(this@MainActivity3,home::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layout.openDrawer(GravityCompat.START)
        }


        set.setOnClickListener()
        {
            val g = Intent(this@MainActivity3,Setting::class.java)
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
            startActivity(Intent.createChooser(intent, "SharaVia"))
        }
    }
}