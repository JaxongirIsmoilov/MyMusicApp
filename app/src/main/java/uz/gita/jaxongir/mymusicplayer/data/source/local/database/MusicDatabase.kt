package uz.gita.jaxongir.mymusicplayer.data.source.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.gita.jaxongir.mymusicplayer.data.source.local.dao.MusicDao
import uz.gita.jaxongir.mymusicplayer.data.source.local.entity.MusicEntity

@Database(entities = [MusicEntity::class], version = 1, exportSchema = false)
abstract class MusicDatabase : RoomDatabase() {

    abstract fun getMusicDao(): MusicDao
}