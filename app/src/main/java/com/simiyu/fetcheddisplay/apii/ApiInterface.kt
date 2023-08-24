package com.simiyu.fetcheddisplay.apii

import com.simiyu.fetcheddisplay.model.ProductResponse
import retrofit2.Response
import retrofit2.http.GET

interface apiinterface {
    @GET("/post")
    suspend fun getProducts(): Response<ProductResponse>


}