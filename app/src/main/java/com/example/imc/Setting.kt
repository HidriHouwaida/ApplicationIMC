package com.example.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_setting.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class Setting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        home.setOnClickListener()
        {
            val gameactivity: Intent = Intent(this@Setting,MainActivity::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layout8.openDrawer(GravityCompat.START)
        }

        srch.setOnClickListener()
        {
            val g: Intent = Intent(this@Setting,Search::class.java)
            startActivity(g)}

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
        logout.setOnClickListener()
        {
            val g: Intent = Intent(this@Setting,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g: Intent = Intent(this@Setting,AboutUs::class.java)
            startActivity(g)}
    }
}