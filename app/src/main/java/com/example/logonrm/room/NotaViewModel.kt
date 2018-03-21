package com.example.logonrm.room

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData

/**
 * Created by logonrm on 20/03/2018.
 */

class NotaViewModel(application: Application) : AndroidViewModel(application) {

    val mRepository: NotaRepository = NotaRepository(application)
    val allNotas: LiveData<List<Nota>>?

    init {
        allNotas = mRepository?.notas
    }

    fun criar(nota: Nota) {
        mRepository.criar(nota)
    }

}