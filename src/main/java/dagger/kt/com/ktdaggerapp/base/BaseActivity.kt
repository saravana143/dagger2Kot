package dagger.kt.com.ktdaggerapp.base

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import dagger.kt.com.ktdaggerapp.App
import dagger.kt.com.ktdaggerapp.home.HomeModule

/*
 BaseActivity for implementing commom and reusable view code goes here
 */
abstract class BaseActivity<C, P : BasePresenter> : AppCompatActivity(), BaseView {

    protected final lateinit var presenter: P

    val Activity.app: App
        get() = application as App

    val component by lazy { app.component.plus(HomeModule()) }

    protected abstract fun setupDependencies()

    override protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupDependencies()

        Log.d("%s onCreate!", javaClass.simpleName)
    }

    override fun onStart() {
        Log.d("%s onStart!", javaClass.simpleName)
        super.onStart()
        presenter.onStart()
    }

    override fun onResume() {
        Log.d("%s onResume!", javaClass.simpleName)
        super.onResume()
        presenter.onResume()
    }

    override fun onPause() {
        Log.d("%s onPause!", javaClass.simpleName)
        presenter.onPause()
        super.onPause()
    }

    override fun onStop() {
        Log.d("%s onStop!", javaClass.simpleName)
        presenter.onStop()
        super.onStop()
    }

    override protected fun onDestroy() {
        Log.d("%s onDestroy!", javaClass.simpleName)
        super.onDestroy()

    }

    override fun showProgress() {
        //TODO such as setVisibility(View.VISIBLE, progressView)
    }

    override fun hideprogress() {
        //TODO such as setVisibility(View.GONE, progressView)
    }

}