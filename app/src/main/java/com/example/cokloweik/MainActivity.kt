package com.example.cokloweik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

var kol=1
var obrt=0
var skala=1.0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.dalej).setOnClickListener {
            kol++
            if(kol==5){
                kol=1
            }
            if(kol==1){
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.obrazek)
            }
            if(kol==2){
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.brazek)
            }
            if(kol==3){
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.razek)
            }
            if(kol==4){
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.azek)
            }
        }
        findViewById<Button>(R.id.wstecz).setOnClickListener {
            kol--
            if(kol==0){
                kol=4
            }
            if(kol==1){
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.obrazek)
            }
            if(kol==2){
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.brazek)
            }
            if(kol==3){
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.razek)
            }
            if(kol==4){
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.azek)
            }
        }
        findViewById<Button>(R.id.lewo).setOnClickListener {
            obrt=findViewById<TextView>(R.id.obrt).text.toString().toInt()
            findViewById<ImageView>(R.id.obrazek).setRotationY(
                findViewById<ImageView>(R.id.obrazek).rotationY + obrt
            )
        }
        findViewById<Button>(R.id.prawo).setOnClickListener {
            obrt=findViewById<TextView>(R.id.obrt).text.toString().toInt()
            findViewById<ImageView>(R.id.obrazek).setRotationY(
                findViewById<ImageView>(R.id.obrazek).rotationY - obrt
            )
        }




    }
}