package com.simiyu.fetcheddisplay.apii

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    var retrofit = Retrofit.Builder()

        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildApiClient(Apiinterface: Class<T>): T {
        return retrofit.create(Apiinterface)

    }
}