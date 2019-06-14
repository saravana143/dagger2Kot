package dagger.kt.com.ktdaggerapp.home.api

import javax.inject.Inject

data class User @Inject constructor(val name: String, val id: String, var age: Int)