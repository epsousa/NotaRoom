package com.example.logonrm.room

import android.app.Application
import android.arch.lifecycle.LiveData

/**
 * Created by logonrm on 20/03/2018.
 */

class NotaRepository(application: Application) {

    val notaDao: NotaDAO?
    val notas: LiveData<List<Nota>>?

    init {
        notaDao = NotaRoomDatabase
                .getDatabase(application)
                ?.notaDAO()

        notas = notaDao?.buscarTodos()
    }


}