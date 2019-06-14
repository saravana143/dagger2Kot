package dagger.kt.com.ktdaggerapp.home

import android.util.Log
import dagger.kt.com.ktdaggerapp.base.BasePresenter
import dagger.kt.com.ktdaggerapp.home.api.User
import javax.inject.Inject

class HomePresenter(var view: HomeView) : BasePresenter() {

    @Inject lateinit var user: User

    fun getHomeScreenData() {
        Log.d("HomePresenter User injected", "User detail=" +user.name + user.id + user.age)

        view.showProgress()
    }

    fun onResult() {
        view.hideprogress()
    }
}