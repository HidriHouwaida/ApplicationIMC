package com.example.imc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_calculpoid.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class calculpoid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculpoid)
        button.setOnClickListener()
        {
            if(taille.text.toString().isEmpty())
            {
                taille.setError("Taille obligatoire!")
                taille.requestFocus()
            }
            else if(poid.text.toString().isEmpty())
            {
                poid.setError("Poid obligatoire!")
                poid.requestFocus()
            }
            else
            {val t=taille.text.toString()
            val p=poid.text.toString()
            val gameActivity = Intent( this@calculpoid,caluculimc::class.java)
            gameActivity.putExtra("poid", p)
            gameActivity.putExtra("taille", t)
            startActivity(gameActivity)}



        }
        //boutton rest
        button2.setOnClickListener()
        {
            taille.text.clear()
            poid.text.clear()
        }

        home.setOnClickListener()
        {
            val gameactivity = Intent(this@calculpoid,MainActivity::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layoutpoid.openDrawer(GravityCompat.START)
        }
        logout.setOnClickListener()
        {
            val g = Intent(this@calculpoid,Lougout::class.java)
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
            startActivity(Intent.createChooser(intent, "Partager avec"))
        }
        srch.setOnClickListener()
        {
            val g = Intent(this@calculpoid,Search::class.java)
            startActivity(g)}
        about.setOnClickListener()
        {
            val g = Intent(this@calculpoid,AboutUs::class.java)
            startActivity(g)}

    }
}