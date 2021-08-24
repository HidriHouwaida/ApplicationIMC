package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_regime_type.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class RegimeType : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regime_type)
        regimedash.setOnClickListener()
        {
            val gameactivity = Intent(this@RegimeType,RegimeDash::class.java)
            startActivity(gameactivity)
        }
        regimesanssel.setOnClickListener()
        {
            val gameactivity = Intent(this@RegimeType,RegimeSansSel::class.java)
            startActivity(gameactivity)
        }
        regimedetox.setOnClickListener()
        {
            val gameactivity = Intent(this@RegimeType,RegimeDetox::class.java)
            startActivity(gameactivity)
        }
        regimesanscholosterol.setOnClickListener()
        {
            val gameactivity = Intent(this@RegimeType,RegimeSansCholosterol::class.java)
            startActivity(gameactivity)
        }
        regimevegeterian.setOnClickListener()
        {
            val gameactivity = Intent(this@RegimeType,RegimeVegeterian::class.java)
            startActivity(gameactivity)
        }
        regimemedeterrian.setOnClickListener()
        {
            val gameactivity = Intent(this@RegimeType,RegimeMedeterian::class.java)
            startActivity(gameactivity)
        }
        home.setOnClickListener()
        {
            val gameactivity = Intent(this@RegimeType,MainActivity::class.java)
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
            val g = Intent(this@RegimeType,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g = Intent(this@RegimeType,AboutUs::class.java)
            startActivity(g)}
        srch.setOnClickListener()
        {
            val g = Intent(this@RegimeType,Search::class.java)
            startActivity(g)}
        men.setOnClickListener()
        {
            drawer_layoutRegimeType.openDrawer(GravityCompat.START)
        }
    }
}