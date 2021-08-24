package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_programme.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class Programme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programme)
        men.setOnClickListener()
        {
            drawer_layoutProgramme.openDrawer(GravityCompat.START)
        }
        regime.setOnClickListener()
        {
            val gameactivity = Intent(this@Programme,Regime::class.java)
            startActivity(gameactivity)
        }
        imc.setOnClickListener()
        {
            val gameactivity = Intent(this@Programme,IMC::class.java)
            startActivity(gameactivity)
        }
        sport.setOnClickListener()
        {
            val gameactivity = Intent(this@Programme,ExerciceSport::class.java)
            startActivity(gameactivity)
        }
        home.setOnClickListener()
        {
            val gameactivity = Intent(this@Programme,MainActivity::class.java)
            startActivity(gameactivity)
        }
        srch.setOnClickListener()
        {
            val g = Intent(this@Programme,Search::class.java)
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
        logout.setOnClickListener()
        {
            val g = Intent(this@Programme,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g = Intent(this@Programme,AboutUs::class.java)
            startActivity(g)}

    }
}