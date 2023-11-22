package uz.gita.jaxongir.mymusicplayer.data.repository

import android.database.Cursor
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import uz.gita.jaxongir.mymusicplayer.data.model.MusicData
import uz.gita.jaxongir.mymusicplayer.data.source.local.dao.MusicDao
import uz.gita.jaxongir.mymusicplayer.domain.repository.AppRepository
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(private val dao: MusicDao) : AppRepository {
    override fun addMusic(musicData: MusicData) {
        dao.addMusic(musicData.toEntity())
    }

    override fun deleteMusic(musicData: MusicData) {
        dao.deleteMusic(musicData.toEntity())
    }

    override fun getAllMusics(): Flow<List<MusicData>> =
        dao.getAllMusics().map { list ->
            list.map { musicEntity ->
                musicEntity.toData()
            }
        }

    override fun getSavedMusics(): Cursor = dao.getSavedMusics()

    override fun queryMusicIsSaved(musicData: MusicData): Boolean {
        val data = dao.queryMusicSaved(musicData.data ?: "")
        return data != null
    }
}