package com.example.controledegasto;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

// Classe que junta classe conexao e o molde de Gasto

public class GastoDAO {

    private Conexao c;
    private SQLiteDatabase banco;

    public GastoDAO(Context context){
        c = new Conexao(context);

        //primeiro criamos o objeto c de conexao e interpretamos eles e jogamos na variavel banco

        banco = c.getWritableDatabase();
    }
    //essa funcao inicia os inserts
    public long insert(Gasto gasto){
        //chamamos uma funcao interna que realiza as funcoes de insert

        ContentValues inserindo = new ContentValues();

        //e com a classe molde pegamos os valores inseridos no formulario e colocamos o atributo da tabela que colocaremos

        inserindo.put("tituloGasto", gasto.getTitulo());
        inserindo.put("descGasto", gasto.getDescricao());
        inserindo.put("valorGasto", gasto.getValor());
        inserindo.put("dataGasto", gasto.getData());

        //e com a funcao insert na qual eu boto a tabela e a funcao inserindo para inserir todos os valores resgatados e devolvo no return o codigo

        return banco.insert("tbGasto", null, inserindo);

    }
}
