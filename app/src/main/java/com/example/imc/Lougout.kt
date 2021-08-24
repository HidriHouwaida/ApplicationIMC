package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_lougout.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*
import kotlin.system.exitProcess

class Lougout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lougout)
        cancel.setOnClickListener()
        {
            exitProcess(0)
        }
        reste.setOnClickListener()
        {
            val gameactivity = Intent(this@Lougout,MainActivity::class.java)
            startActivity(gameactivity)
        }
        log.setOnClickListener()
        {
            val gameactivity = Intent(this@Lougout,SiginIn::class.java)
            startActivity(gameactivity)
        }
        home.setOnClickListener()
        {
            val gameactivity = Intent(this@Lougout,MainActivity::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layout3.openDrawer(GravityCompat.START)
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
        about.setOnClickListener()
        {
            val g = Intent(this@Lougout,AboutUs::class.java)
            startActivity(g)}
        srch.setOnClickListener()
        {
            val g = Intent(this@Lougout,Search::class.java)
            startActivity(g)}

    }
}