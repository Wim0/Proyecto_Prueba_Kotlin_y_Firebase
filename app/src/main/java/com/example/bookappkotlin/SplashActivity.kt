package com.example.bookappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Inicia la MainActivity después de 2 segundos
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
        }, 2000) //Indica un delay de 2 segundos
    }
}