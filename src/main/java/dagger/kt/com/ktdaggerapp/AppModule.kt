package dagger.kt.com.ktdaggerapp

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * This module provides global dependencies.
 */
@Module
class AppModule(val app: App) {
    @Provides
    @Singleton
    fun provideApp() = app
}