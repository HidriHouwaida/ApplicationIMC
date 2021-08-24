package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_menu_sport.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class MenuSport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_sport)
        home.setOnClickListener()
        {
            val gameactivity = Intent(this@MenuSport,MainActivity::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layoutMenuSport.openDrawer(GravityCompat.START)
        }



        logout.setOnClickListener()
        {
            val g = Intent(this@MenuSport,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g = Intent(this@MenuSport,AboutUs::class.java)
            startActivity(g)}
        srch.setOnClickListener()
        {
            val g = Intent(this@MenuSport,Search::class.java)
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
        exercice_cardiovasculaire.setOnClickListener()
        {
            val g = Intent(this@MenuSport,ExerciceCardiovasculaire::class.java)
            startActivity(g)
        }
        exercice_musculation.setOnClickListener()
        {
            val g = Intent(this@MenuSport,exercicemusculation::class.java)
            startActivity(g)
        }
        exercice_equlibre.setOnClickListener()
        {
            val g = Intent(this@MenuSport,exercicequilibre::class.java)
            startActivity(g)
        }
        etirement.setOnClickListener()
        {
            val g = Intent(this@MenuSport,exercicetirement::class.java)
            startActivity(g)
        }
        course.setOnClickListener()
        {
            val g = Intent(this@MenuSport,exercicecourse::class.java)
            startActivity(g)
        }
    }
}