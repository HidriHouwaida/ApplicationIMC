package com.example.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_chronometre.*
import kotlinx.android.synthetic.main.activity_exercicecourse.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class Chronometre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chronometre)
        home.setOnClickListener()
        {
            val gameactivity = Intent(this@Chronometre,MainActivity::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layoutchronometre.openDrawer(GravityCompat.START)
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
            val g = Intent(this@Chronometre,Lougout::class.java)
            startActivity(g)
        }
        var running :Boolean=false;
        var pauseoff:Long=0;
        button1.setOnClickListener()
        {
            if(!running)
            {   chronometre.setBase(SystemClock.elapsedRealtime()-pauseoff);
                chronometre.start();
                running=true
            }
        }
        button2.setOnClickListener()
        {
            if(running)
            {
                chronometre.stop()
                pauseoff=SystemClock.elapsedRealtime()-chronometre.getBase();
                running=false
            }
        }
        button3.setOnClickListener()
        {
            chronometre.setBase(SystemClock.elapsedRealtime())
            pauseoff=0
        }
        srch.setOnClickListener()
        {
            val g = Intent(this@Chronometre,Search::class.java)
            startActivity(g)}
        about.setOnClickListener()
        {
            val g =Intent(this@Chronometre,AboutUs::class.java)
            startActivity(g)}
    }
}