package dagger.kt.com.ktdaggerapp

import dagger.Component
import dagger.kt.com.ktdaggerapp.home.HomeComponent
import dagger.kt.com.ktdaggerapp.home.HomeModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = arrayOf(
        AppModule::class
    )
)
interface AppComponent {
    fun plus(homeModule: HomeModule): HomeComponent

    fun inject(app: App)
}