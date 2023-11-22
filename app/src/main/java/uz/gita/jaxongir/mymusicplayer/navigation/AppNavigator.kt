package uz.gita.jaxongir.mymusicplayer.navigation

import cafe.adriel.voyager.androidx.AndroidScreen

typealias MyScreen = AndroidScreen
interface AppNavigator {
    suspend fun pop()
    suspend fun navigateTo(myScreen: MyScreen)
    suspend fun replace(myScreen: MyScreen)
}