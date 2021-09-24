package br.com.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //criando acao de click no botao

        btnEnviar.setOnClickListener {
            //capturando o texto digitado
            val nome = edtNome.text.toString().trim()
            if(nome.isNotEmpty()){

                //criando um objeto(objeto sempre minusculo)

                val intent = Intent(this,Tela2Activity::class.java)

                //adicionando um dado a um objeto intent

                intent.putExtra("nome", nome)
                intent.putExtra("idade" , 88)


                //executar acao

                startActivity(intent)
                }else{
                        //apresentar msg
                        Toast.makeText(this@MainActivity,"Escreve direito seu Gay",Toast.LENGTH_LONG).show()
            }

        }



    }
}
