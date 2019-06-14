package dagger.kt.com.ktdaggerapp.home

import dagger.Module
import dagger.Provides
import dagger.kt.com.ktdaggerapp.home.api.User
import javax.inject.Singleton

@Module
class HomeModule {

    @Provides
    fun provideUser(): User {
        return User("John", "JO11", 23)
    }
}