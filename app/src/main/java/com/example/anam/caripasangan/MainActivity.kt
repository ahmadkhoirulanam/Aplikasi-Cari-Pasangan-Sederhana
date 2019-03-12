package com.example.anam.caripasangan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.anam.caripasangan.R.id.btnMatch
import com.example.anam.caripasangan.R.id.emon1
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener { carijodoh() }

        }

        fun carijodoh() {
            val randomDora = Random().nextInt(4)+1
            val randomemon = Random().nextInt(4)+1
            val drawableResDora = when (randomDora){
                1 ->R.drawable.rizal
                2 ->R.drawable.huda
                3 ->R.drawable.firman
                4 ->R.drawable.niam
                else -> R.drawable.anam            }

            val drawableResemon = when (randomemon){
                1 ->R.drawable.chendi
                2 ->R.drawable.fuji
                3 ->R.drawable.miabi
                4 ->R.drawable.iklimah
                else -> R.drawable.ninik

            }

            emon1.setImageResource(drawableResDora)
            dora1.setImageResource(drawableResemon)



        } }

