package br.com.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        //recuperado a dado de intent
        val nome = intent.getStringExtra("nome")

        //apresentar no textview

        txvSaudacao.text = "Bem Vindo $nome"

        //botao sair
        btnSair.setOnClickListener {
            onBackPressed()
        }



    }
}
