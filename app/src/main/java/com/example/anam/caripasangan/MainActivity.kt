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
            val randomDora = Random().nextInt(3)+1
            val randomemon = Random().nextInt(3)+1
            val drawableResDora = when (randomDora){
                1 ->R.drawable.coin
                2 ->R.drawable.clock_grey
                else -> R.drawable.github            }

            val drawableResemon = when (randomemon){
                1 ->R.drawable.triviafinal
                2 ->R.drawable.wrongans
                else -> R.drawable.gambar

            }

            emon1.setImageResource(drawableResDora)
            dora1.setImageResource(drawableResemon)



        } }

