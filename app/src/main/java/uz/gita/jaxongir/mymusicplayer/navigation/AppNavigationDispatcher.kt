package uz.gita.jaxongir.mymusicplayer.navigation

import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton

class AppNavigationDispatcher @Inject constructor() : AppNavigator, AppNavigationHandler {
    override val navigationFlow = MutableSharedFlow<NavigationArgs>()

    private suspend fun navigate(navigationArgs: NavigationArgs) {
        navigationFlow.emit(navigationArgs)
    }

    override suspend fun pop() = navigate {
        pop()
    }

    override suspend fun navigateTo(myScreen: MyScreen) = navigate {
        push(myScreen)
    }

    override suspend fun replace(myScreen: MyScreen) = navigate {
        replace(myScreen)
    }
}