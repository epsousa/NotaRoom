package com.example.logonrm.room

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var notaViewModel: NotaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        notaViewModel = ViewModelProviders.of(this).get(NotaViewModel::class.java)

        fab.setOnClickListener { view ->
            notaViewModel.criar(Nota(null, "Criar um novo app"))
        }
    }

}
