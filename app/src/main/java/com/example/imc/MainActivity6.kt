package com.example.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_exempleexercicecardio.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        home.setOnClickListener()
        {
            val gameactivity = Intent(this@MainActivity6,MainActivity::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layoutexempleExercicecardio.openDrawer(GravityCompat.START)
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
            val g = Intent(this@MainActivity6,Lougout::class.java)
            startActivity(g)
        }
        srch.setOnClickListener()
        {
            val g = Intent(this@MainActivity6,Search::class.java)
            startActivity(g)}
        about.setOnClickListener()
        {
            val g = Intent(this@MainActivity6,AboutUs::class.java)
            startActivity(g)}
    }
}