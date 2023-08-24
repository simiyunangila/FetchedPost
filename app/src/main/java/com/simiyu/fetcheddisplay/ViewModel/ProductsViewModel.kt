package com.simiyu.fetcheddisplay.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.simiyu.fetcheddisplay.Repository.ProductRepository
import com.simiyu.fetcheddisplay.model.products
import kotlinx.coroutines.launch

class ProductsViewModel:ViewModel() {

        val productRepo =ProductRepository()
        val producctLiveData = MutableLiveData<List<products>>()
        val errorLiveData = MutableLiveData<String>()
        fun fetchProducts(){
            viewModelScope.launch{
                val response = productRepo.getProducts()
                if (response.isSuccessful){
                    producctLiveData.postValue(response.body()?.products)
                }
                else{
                    errorLiveData.postValue(response.errorBody()?.string())
                }
            }
        }

    }



