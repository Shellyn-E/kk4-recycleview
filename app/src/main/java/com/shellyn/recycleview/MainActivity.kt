package com.shellyn.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.captainamerica,
                nameSuperhero = "Captain America",
                descSuperhero = "Captain America is a superhero appearing in American comic books published by Marvel Comics. Created by cartoonists Joe Simon and Jack Kirby, the character first appeared in Captain America Comics #1 from Timely Comics, a predecessor of Marvel Comics."
            ),
            Superhero(
                R.drawable.blackwidow,
                nameSuperhero = "Black Widow",
                descSuperhero = "Natasha Romanoff, a member of the Avengers and a former KGB spy, is forced to confront her dark past when a conspiracy involving her old handler arises."
            ),
            Superhero(
                R.drawable.blackpanther,
                nameSuperhero = "Black Panther",
                descSuperhero = "After his father's death, T'Challa returns home to Wakanda to inherit his throne. However, a powerful enemy related to his family threatens to attack his nation."
            ),
            Superhero(
                R.drawable.captainmarvel,
                nameSuperhero = "Captain Marvel",
                descSuperhero = "Amidst a mission, Vers, a Kree warrior, gets separated from her team and is stranded on Earth. However, her life takes an unusual turn after she teams up with Fury, a S.H.I.E.L.D. agent."
            ),
            Superhero(
                R.drawable.guardian,
                nameSuperhero = "Groot",
                descSuperhero = "Groot is a fictional character appearing in American comic books published by Marvel Comics. Created by Stan Lee, Larry Lieber and Jack Kirby, the character first appeared in Tales to Astonish #13."
            ),
            Superhero(
                R.drawable.doctorstrange,
                nameSuperhero = "Doctor Strange",
                descSuperhero = "In an accident, Stephen Strange, a famous neurosurgeon, loses the ability to use his hands. He goes to visit the mysterious Ancient One to heal himself and becomes a great sorcerer under her tutelage."
            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "In an accident, Stephen Strange, a famous neurosurgeon, loses the ability to use his hands. He goes to visit the mysterious Ancient One to heal himself and becomes a great sorcerer under her tutelage."
            ),
            Superhero(
                R.drawable.ironman,
                nameSuperhero = "Iron Man",
                descSuperhero = "Iron Man is a superhero appearing in American comic books published by Marvel Comics. The character was co-created by writer and editor Stan Lee, developed by scripter Larry Lieber, and designed by artists Don Heck and Jack Kirby."
            ),
            Superhero(
                R.drawable.spiderman,
                nameSuperhero = "Spider Man",
                descSuperhero = "Spider-Man is a superhero appearing in American comic books published by Marvel Comics. Created by writer-editor Stan Lee and artist Steve Ditko, he first appeared in the anthology comic book Amazing Fantasy #15 in the Silver Age of Comic Books."
            ),
            Superhero(
                R.drawable.thor,
                nameSuperhero = "Thor",
                descSuperhero = "Thor Odinson, usually simply Thor, is a fictional character appearing in American comic books published by Marvel Comics."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}