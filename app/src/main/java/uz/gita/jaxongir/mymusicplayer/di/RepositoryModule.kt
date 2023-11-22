package uz.gita.jaxongir.mymusicplayer.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.jaxongir.mymusicplayer.data.repository.AppRepositoryImpl
import uz.gita.jaxongir.mymusicplayer.domain.repository.AppRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @[Binds Singleton]
    fun bindAppRepository(impl: AppRepositoryImpl): AppRepository
}