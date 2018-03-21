package com.example.logonrm.room

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            NotaRoomDatabase
                    .getDatabase(this)
                    ?.notaDAO()
                    ?.criar(Nota(null, "Primeira nota"))

            val notas = NotaRoomDatabase.getDatabase(this)
                    ?.notaDAO()
                    ?.buscarTodos()

            for (nota in notas!!) {
                Log.i("TAG", nota.descricacao)
            }

        }
    }

}
