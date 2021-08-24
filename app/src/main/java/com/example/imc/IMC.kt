package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_i_m_c.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_i_m_c)
        home.setOnClickListener()
        {
            val gameactivity = Intent(this@IMC,MainActivity::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layoutimc.openDrawer(GravityCompat.START)
        }



        logout.setOnClickListener()
        {
            val g = Intent(this@IMC,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g = Intent(this@IMC,AboutUs::class.java)
            startActivity(g)}
        imc.setOnClickListener()
        {
            val g = Intent(this@IMC,calculpoid::class.java)
            startActivity(g)
        }
        srch.setOnClickListener()
        {
            val g = Intent(this@IMC,Search::class.java)
            startActivity(g)}

        shar.setOnClickListener()
        {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            val body = "Download this App"
            val sub = "http://play.google.com"
            intent.putExtra(Intent.EXTRA_TEXT, body)
            intent.putExtra(Intent.EXTRA_TEXT, sub)
            startActivity(Intent.createChooser(intent, "Patager avec"))
        }


    }
}