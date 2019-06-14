package dagger.kt.com.ktdaggerapp

import android.app.Application
import android.util.Log

class App : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        Log.d("APP", "Pre-Set up object graph")
        component.inject(this)
        Log.d("APP", "Post-Set up object graph")
    }
}

