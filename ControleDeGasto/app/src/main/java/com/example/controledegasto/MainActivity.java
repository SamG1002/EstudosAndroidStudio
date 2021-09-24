package com.example.controledegasto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edTitulo = (EditText) findViewById(R.id.edtTit);
    EditText edDescricao = (EditText) findViewById(R.id.edtDesc);
    EditText edValor = (EditText) findViewById(R.id.edtValor);
    EditText edData = (EditText) findViewById(R.id.edtData);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //botao para adicionar
    public void addDespesa(View view) {
        //declaro as classes explicadas anteriormente
        Gasto gasto = new Gasto();
        GastoDAO GDAO = new GastoDAO(this);

        //seto dentro do objeto os dados do formulario
        gasto.setTitulo(edTitulo.getText().toString());
        gasto.setDescricao(edDescricao.getText().toString());
        gasto.setValor(edValor.getText().toString());
        gasto.setData(edData.getText().toString());

        //uso o metodo criado na classe GastoDAO para realizar o insert e atribuo o retorno(o codigo) a uma variavel
        long getId = GDAO.insert(gasto);
        //apos o resgate do id cadastrado do banco eu apresento em um toast para ser informado da conclusao confirmada da insercao
        Toast.makeText(this, (int) getId, Toast.LENGTH_LONG).show();


    }
}