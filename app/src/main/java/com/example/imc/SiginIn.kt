package com.example.imc

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_sigin_in.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class SiginIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sigin_in)
        val dblogin=DBLogin(this)
        men.setOnClickListener()
        {
            drawer_layoutSignIn.openDrawer(GravityCompat.START)
        }
        registr.setOnClickListener()
        {
            val gameactivity = Intent(this@SiginIn,SignUp::class.java)
            startActivity(gameactivity)
        }
        fun String.isValidEmail():Boolean
        {
            return Patterns.EMAIL_ADDRESS.matcher(this).matches()
        }
        connexion.setOnClickListener()
        {
            if(email.text?.isEmpty()!!)
            {
                email.error = "Email obligatoire!"
                email.requestFocus()}
            else if(!email.text.toString().isValidEmail())
            {
                email.error = "Email non valide!"
                email.requestFocus() }
            else  if(password.text?.isEmpty()!!)
            {
                password.error = "Mot de passe obligatoire!"
                password.requestFocus()

            }
            else  if(password.text!!.length<6)
            {
                password.error = "Longuer minimal de mot de passe>6!"
                password.requestFocus()
            }
            else
            {   if(!dblogin.checkusernamepassword(email.text.toString(),password.text.toString()))
            {
                Toast.makeText(this,"Email ou Mot de passe incorrecte",Toast.LENGTH_SHORT).show()
            }
                else
            {   val gameactivity =Intent(this@SiginIn,Programme::class.java)
                startActivity(gameactivity) }
            }}
        logout.setOnClickListener()
        {
            val g =Intent(this@SiginIn,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g =Intent(this@SiginIn,AboutUs::class.java)
            startActivity(g)}

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
            val g =Intent(this@SiginIn,Search::class.java)
            startActivity(g)
        }
        home.setOnClickListener()
        {
            val g =Intent(this@SiginIn,MainActivity::class.java)
            startActivity(g)
        }
            passe.setOnClickListener()
            {
                val g =Intent(this@SiginIn,MotDepasse::class.java)
                startActivity(g)
            }

}}