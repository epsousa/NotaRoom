package com.example.logonrm.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by logonrm on 20/03/2018.
 */

@Database(entities = arrayOf(Nota::class), version = 1)
abstract class NotaRoomDatabase : RoomDatabase() {

}