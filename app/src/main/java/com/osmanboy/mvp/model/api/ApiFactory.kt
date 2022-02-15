package com.osmanboy.mvp.model.api

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiFactory private constructor() {
    private var retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    val apiService: ApiService
        get() = retrofit.create(ApiService::class.java)

    companion object {

        private var apiFactory: ApiFactory? = null
        private const val BASE_URL = "http://gitlab.65apps.com/65gb/static/raw/master/"

        fun getInstance(): ApiFactory {
            apiFactory?.let { return it }
            val newApiFactory = ApiFactory()
            apiFactory = newApiFactory
            return newApiFactory
        }

    }


}