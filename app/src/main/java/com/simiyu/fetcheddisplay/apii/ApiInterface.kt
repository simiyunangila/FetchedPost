package com.simiyu.fetcheddisplay.apii

import com.simiyu.fetcheddisplay.model.ProductResponse
import com.simiyu.fetcheddisplay.model.products
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface apiinterface {
    @GET("/post")
    suspend fun getProducts(): Response<ProductResponse>

    @GET("/post/{id}")
    suspend fun getProductsbyId(@Path("id") productId: Int): Response<products>




}