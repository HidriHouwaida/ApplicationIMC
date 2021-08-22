package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_regime.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class Regime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regime)
        men.setOnClickListener()
        {
            drawer_layoutRegime.openDrawer(GravityCompat.START)
        }
        choix.setOnClickListener()
        {
            val gameactivity = Intent(this@Regime,RegimeType::class.java)
            startActivity(gameactivity)
        }
        logout.setOnClickListener()
        {
            val g = Intent(this@Regime,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g = Intent(this@Regime,AboutUs::class.java)
            startActivity(g)}
        set.setOnClickListener()
        {
            val g = Intent(this@Regime,Setting::class.java)
            startActivity(g)
        }
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
        srch.setOnClickListener()
        {
            val g = Intent(this@Regime,Search::class.java)
            startActivity(g)
        }
        home.setOnClickListener()
        {
            val g = Intent(this@Regime,MainActivity::class.java)
            startActivity(g)
        }
    }
}