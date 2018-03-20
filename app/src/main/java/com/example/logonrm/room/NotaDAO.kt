package com.example.logonrm.room

import android.arch.persistence.room.*

/**
 * Created by logonrm on 20/03/2018.
 */

@Dao
interface NotaDAO {

    @Insert
    fun criar(nota: Nota)

    @Update
    fun atualizar(nota: Nota)

    @Delete
    fun deletar(nota: Nota)

    @Query("SELECT * FROM NOTA")
    fun buscarTodos(): List<Nota>

}