package com.example.controledegasto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    public static final String name = "bdControleDeGasto.db";
    public static final int version = 1;

    //com ajuda do openHelper a classe de criacao do banco é criada e configurada da maneira desejada por mim

    public Conexao(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    //aqui usamos uma funcao na qual executa um comando sql, e aqui eu coloquei a cricao da tabela juntamente com seus atributos
        db.execSQL("" +
                "CREATE TABLE tbGasto (" +
                    "idGasto integer primary key autoincrement," +
                    "tituloGasto Varchar(40) not null," +
                    "descGasto Varchar(60) not null," +
                    "valorGasto Varchar(60) not null," +
                    "dataGasto Varchar(10) not null," +
                    ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
