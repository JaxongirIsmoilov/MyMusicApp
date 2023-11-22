package uz.gita.jaxongir.mymusicplayer.data.model

import android.graphics.Bitmap
import android.net.Uri
import uz.gita.jaxongir.mymusicplayer.data.source.local.entity.MusicEntity
import java.io.ByteArrayOutputStream

data class MusicData(
    val uri: Uri,
    val id: Int,
    val artist: String?,
    val title: String?,
    val data: String?,
    val duration: Long,
    val albumArt: Bitmap?
){

    fun toEntity() = MusicEntity(id, uri.toString(),artist, title, data, duration,
        albumArt?.let { convertBitmapToByteArray(it) })
    private fun convertBitmapToByteArray(bitmap: Bitmap): ByteArray {
        val stream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
        return stream.toByteArray()
    }
}
