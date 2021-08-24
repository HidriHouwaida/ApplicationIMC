package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_regime_dash.*
import kotlinx.android.synthetic.main.activity_regime_type.regimedash
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class RegimeDash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regime_dash)
        regimedash.setOnClickListener()
        {
        val gameactivity = Intent(this@RegimeDash,ProgrammeDah::class.java)
        startActivity(gameactivity)}
        home.setOnClickListener()
        {
            val gameactivity = Intent(this@RegimeDash,MainActivity::class.java)
            startActivity(gameactivity)
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
            val g = Intent(this@RegimeDash,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g = Intent(this@RegimeDash,AboutUs::class.java)
            startActivity(g)}
        srch.setOnClickListener()
        {
            val g = Intent(this@RegimeDash,Search::class.java)
            startActivity(g)}
        men.setOnClickListener()
        {
            drawer_layoutRegimeDash.openDrawer(GravityCompat.START)
        }
    }
}