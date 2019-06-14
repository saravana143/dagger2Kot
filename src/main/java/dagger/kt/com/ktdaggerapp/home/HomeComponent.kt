package dagger.kt.com.ktdaggerapp.home

import dagger.Subcomponent


@Subcomponent(modules = arrayOf(HomeModule::class))
interface HomeComponent {
    fun inject(presenter: HomePresenter)
    fun inject(activity: HomeActivity)
    fun inject(view: HomeView)
}