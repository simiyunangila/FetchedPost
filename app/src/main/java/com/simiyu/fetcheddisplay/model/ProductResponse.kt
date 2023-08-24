package com.simiyu.fetcheddisplay.model

data class ProductResponse(
    var products:List<products>,
    var total:Int,
    var skip:Int,
    var limit:Int

)
