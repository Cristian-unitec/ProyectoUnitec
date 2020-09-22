package org.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//El punto de partida de toda APP es la MainActivity (Presenter)
//Prueba de github
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}