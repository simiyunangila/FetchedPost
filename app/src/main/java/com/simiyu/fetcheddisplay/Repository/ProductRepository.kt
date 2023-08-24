package com.simiyu.fetcheddisplay.Repository

import com.simiyu.fetcheddisplay.apii.ApiClient
import com.simiyu.fetcheddisplay.apii.apiinterface
import com.simiyu.fetcheddisplay.model.ProductResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class ProductRepository {
    val apiClient = ApiClient.buildApiClient(apiinterface::class.java)

    suspend fun getProducts():Response<ProductResponse>{
        return withContext(Dispatchers.IO){
            apiClient.getProducts()
        }
    }
}