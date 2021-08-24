package com.example.imc

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_search.*
import kotlinx.android.synthetic.main.main_nav_drawer.*
import kotlinx.android.synthetic.main.main_toolbar.*

class Search : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        home.setOnClickListener()
        {
            val gameactivity = Intent(this@Search,MainActivity::class.java)
            startActivity(gameactivity)
        }
        men.setOnClickListener()
        {
            drawer_layout20.openDrawer(GravityCompat.START)
        }
        log.setOnClickListener()
        {
            val gameactivity = Intent(this@Search,SiginIn::class.java)
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
            startActivity(Intent.createChooser(intent, "Partager avec "))
        }
        about.setOnClickListener()
        {
            val g = Intent(this@Search,AboutUs::class.java)
            startActivity(g)}
        val texte=item.text
        chercher.setOnClickListener()
        {if(edittext.text.toString()=="Poids")
        {
            textv.text="Force exercée par un corps matériel, proportionnelle à la masse de ce " +
                    "   corps et à l'intensité de la pesanteur au point où se trouve le corps " +
                    "(dans le langage courant, on emploie poids pour masse).\n" +
                    "D'un poids faible (léger), d'un grand poids (lourd, pesant)."
            item.text=""
        }
            if(edittext.text.toString()=="Taille")
            {
                textv.text="La taille est le terme anatomique désignant la partie du corps " +
                        "   comprise entre les côtes et le bassin."
                item.text=""
            }
            if(edittext.text.toString()=="IMC")
            {
                textv.text="L’indice de masse corporelle ou IMC (en anglais, body mass index ou BMI) " +
                        "est une grandeur qui permet d'estimer la corpulence d’une personne."
                item.text=""
            }
            if(edittext.text.toString()=="Alimentation équilibré")
            {
                textv.text="Une alimentation équilibrée est une adaptation équilibrée entre les différents nutriments : lipides, glucides et protides.\n" +
                        "Mais c'est aussi un apport suffisant en vitamines et en oligo-éléments.\n" +
                        "C'est aussi une répartition harmonieuse de la ration alimentaire au cours de la journée.\n" +
                        "Et enfin, c'est une alimentation suffisante en quantité, mais pas excessive."
                item.text=""
            }
            if(edittext.text.toString()=="Matiére grasses")
            {
                textv.text="La matière grasse est un composant naturellement présent dans de nombreux aliments " +
                        "   et elle constitue une part essentielle de notre alimentation. " +
                        "   Les huiles et graisses sont également appelées corps gras ou matière grasse."
                item.text=""
            }
            if(edittext.text.toString()=="Poids idéal")
            {
                textv.text="Le poids idéal ou poids normal est le poids d'une personne présentant " +
                        "une corpulence considérée" + "   comme normale ou moyenne dans une société donnée."
                item.text=""
            }
            if(edittext.text.toString()=="Obésité")
            {
                textv.text="L’obésité correspond à un excès de masse grasse et à une modification du tissu adipeux\n" +
                        ", entraînant des inconvénients pour la santé et pouvant réduire l’espérance de vie. Ses causes sont complexes. " +
                        "Elle résulte de l’intrication de plusieurs facteurs − alimentaires, génétiques épigénétiques et environnementaux − " +
                        "impliqués dans le développement et la progression de cette maladie chronique."
                item.text=""
            }
            if(edittext.text.toString()=="Maladies métaboliques")
            {
                textv.text="Une maladie métabolique est un trouble médical qui affecte les métabolismes dans la cellule," +
                        "    en particulier la production d'énergie."
                item.text=""
            }

            if(edittext.text.toString()=="Pathalogie")
            {
                textv.text="La pathologie, est la science qui a pour objet l'étude des maladies et notamment" +
                        "   leurs causes et leurs mécanismes."
                item.text=""
            }
        }
        Reset.setOnClickListener()
        {
            edittext.text.clear()
            textv.text="Les Mots Existants"
            item.text=texte
        }


    }
}