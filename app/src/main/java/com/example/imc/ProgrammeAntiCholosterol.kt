package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_programme_anti_cholosterol.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class ProgrammeAntiCholosterol : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programme_anti_cholosterol)
        men.setOnClickListener()
        {
            drawer_layoutProgrammeAnticholoestrol.openDrawer(GravityCompat.START)
        }
        logout.setOnClickListener()
        {
            val g = Intent(this@ProgrammeAntiCholosterol,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g = Intent(this@ProgrammeAntiCholosterol,AboutUs::class.java)
            startActivity(g)}

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
            val g = Intent(this@ProgrammeAntiCholosterol,Search::class.java)
            startActivity(g)
        }
        home.setOnClickListener()
        {
            val g = Intent(this@ProgrammeAntiCholosterol,MainActivity::class.java)
            startActivity(g)
        }
    }
}