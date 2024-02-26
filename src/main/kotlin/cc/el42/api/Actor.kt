package cc.el42.api

import retrofit2.http.GET

interface ActorService {
    @GET("/")
    fun getPreferences()
}