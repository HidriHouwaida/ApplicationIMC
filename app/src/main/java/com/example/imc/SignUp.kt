package com.example.imc

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val dblogin =DBLogin(this)
        men.setOnClickListener()
        {
            drawer_layoutSiginUp.openDrawer(GravityCompat.START)
        }
        fun String.isValidEmail():Boolean
        {
            return Patterns.EMAIL_ADDRESS.matcher(this).matches()
        }
        registre.setOnClickListener()
        {
            if(username.text.isEmpty())
            {
                username.error = "Nom obligatoire!"
                username.requestFocus()

            }
            else if(fullname.text.isEmpty())
            {
                fullname.error = "Prénom obligatoire!"
                fullname.requestFocus()

            }

            else if(Email.text.toString().isEmpty())
            {
                Email.error = "Email is obligatoire!"
                Email.requestFocus()

            }
            else if(!Email.text.toString().isValidEmail())
            {
                Email.error = "Email non valide!"
                Email.requestFocus()

            }
            else  if(Password.text.toString().isEmpty())
            {
                Password.error = "Mot de passe obligatoire!"
                Password.requestFocus()

            }
            else  if(Password.text!!.length<6)
            {
                Password.error = "Longuer minimal de mot de passe>6!"
                Password.requestFocus()
            }

               else if(dblogin.checkusername(username.text.toString()))
                {
                    Toast.makeText(this,"Utilisateur existe déja!",Toast.LENGTH_SHORT).show()
                }
                else
                {
                    dblogin.insert(username.text.toString(),Password.text.toString(),Email.text.toString(),fullname.text.toString(),age.text.toString())
                    val gameactivity =Intent(this@SignUp,SiginIn::class.java)
                    startActivity(gameactivity)}
            }





        home.setOnClickListener()
        {
            val gameactivity = Intent(this@SignUp,MainActivity::class.java)
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
            startActivity(Intent.createChooser(intent, " Partager avec "))
        }
        logout.setOnClickListener()
        {
            val g = Intent(this@SignUp,Lougout::class.java)
            startActivity(g)
        }
        about.setOnClickListener()
        {
            val g = Intent(this@SignUp,AboutUs::class.java)
            startActivity(g)}
        srch.setOnClickListener()
        {
            val g = Intent(this@SignUp,Search::class.java)
            startActivity(g)}
        imageage.setOnClickListener()
        {
            val g = Intent(this@SignUp,Calendrier::class.java)
            startActivity(g)
        }
        //******************************************************************************************

        //récuparation des dates
        //******************************************************************************************
        val i:Intent= intent
        val date: String? =i.getStringExtra("date")
        age.setText(date)

    }
}