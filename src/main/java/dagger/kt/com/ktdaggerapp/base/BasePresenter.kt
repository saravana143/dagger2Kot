package dagger.kt.com.ktdaggerapp.base

import android.support.annotation.CallSuper
import android.util.Log

/*
 BasePresenter for implementing commom and reusable business behaviour code goes here
 */
abstract class BasePresenter {

    @CallSuper
    protected fun create() {
    }

    @CallSuper
    protected fun start() {
    }

    @CallSuper
    protected fun resume() {
    }

    @CallSuper
    protected fun pause() {

    }

    @CallSuper
    protected fun stop() {

    }

    fun onCreate() {
        create()
    }

    fun onStart() {
        start()
    }

    fun onResume() {
        resume()
    }

    fun onPause() {
        pause()
    }

    fun onStop() {
        stop()
    }

}