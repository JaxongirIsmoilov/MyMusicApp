package uz.gita.jaxongir.mymusicplayer.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.jaxongir.mymusicplayer.navigation.AppNavigationDispatcher
import uz.gita.jaxongir.mymusicplayer.navigation.AppNavigationHandler
import uz.gita.jaxongir.mymusicplayer.navigation.AppNavigator
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {
    @[Binds Singleton]
    fun bindAppNavigator(impl: AppNavigationDispatcher) : AppNavigator

    @[Binds Singleton]
    fun bindsAppNavigationHandler(impl: AppNavigationDispatcher) : AppNavigationHandler
}