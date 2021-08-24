package com.example.imc

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_caluculimc.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class caluculimc : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caluculimc)
        val e: Bundle? =intent.extras
        val poi:String= e?.getString("poid").toString()
        val tai:String=e?.getString("taille").toString()
        t1.text=tai
        p1.text=poi
        val imc1=((p1.text.toString().toFloat()/(t1.text.toString().toFloat()*t1.text.toString().toFloat()))*10000)
        imc.text=imc1.toString()
        if(imc1<18.5)
        {
            resultat.text="insuffisance pondérale"
        }
        else  if(18.5<imc1 && imc1<24.9)
        {
            resultat.text="poids normal"
        }
        else if(25<imc1 && imc1<29.9)
        {
            resultat.text="surpoid"
        }
        else if(imc1>30)
        {
            resultat.text="obésité"
        }

        //boutoun voir votre conseil
        button1.setOnClickListener()
        {

            if(imc1<18.5)
            {val gameActivity = Intent( this@caluculimc,MainActivity3::class.java)
                startActivity(gameActivity)
            }
            else if(18.5<imc1 && imc1<24.9)
            {val gameActivity = Intent( this@caluculimc,MainActivity4::class.java)
                startActivity(gameActivity) }
            else if(25<imc1 && imc1<29.9)
            {
                val gameActivity = Intent( this@caluculimc,MainActivity5::class.java)
                startActivity(gameActivity)
            }
            else if(imc1>30)
            { val gameActivity = Intent( this@caluculimc,MainActivity6::class.java)
                startActivity(gameActivity)

            }
        }

        home.setOnClickListener()
        {
            val gameactivity = Intent(this@caluculimc,MainActivity::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layoutcalculimc.openDrawer(GravityCompat.START)
        }
        logout.setOnClickListener()
        {
            val g = Intent(this@caluculimc,Lougout::class.java)
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
            val g = Intent(this@caluculimc,Search::class.java)
            startActivity(g)}
        about.setOnClickListener()
        {
            val g =Intent(this@caluculimc,AboutUs::class.java)
            startActivity(g)}
    }
}