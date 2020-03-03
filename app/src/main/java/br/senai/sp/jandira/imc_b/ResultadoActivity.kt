package br.senai.sp.jandira.imc_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

       var peso = intent.getStringExtra("peso")

        Toast.makeText(this, "I'm an android programmer", Toast.LENGTH_LONG).show()


    }
}
