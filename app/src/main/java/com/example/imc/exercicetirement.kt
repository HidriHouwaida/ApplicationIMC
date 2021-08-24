package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_exercicetirement.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class exercicetirement : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicetirement)
        home.setOnClickListener()
        {
            val gameactivity = Intent(this@exercicetirement,MainActivity::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layoutExerciceetirement.openDrawer(GravityCompat.START)
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
        logout.setOnClickListener()
        {
            val g = Intent(this@exercicetirement,Lougout::class.java)
            startActivity(g)
        }
        srch.setOnClickListener()
        {
            val g = Intent(this@exercicetirement,Search::class.java)
            startActivity(g)}
        about.setOnClickListener()
        {
            val g =Intent(this@exercicetirement,AboutUs::class.java)
            startActivity(g)}
    }
}