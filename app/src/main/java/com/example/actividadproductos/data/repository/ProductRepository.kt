package com.example.actividadproductos.data.repository

import com.example.actividadproductos.data.model.Product
import com.example.actividadproductos.data.model.ProductCategory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

object ProductRepository {
    private val _products = MutableStateFlow<List<Product>>(
        listOf()
    )
    val products: StateFlow<List<Product>> = _products.asStateFlow()

    fun addProduct(product: Product) {
        _products.update { currentList ->
            currentList + product
        }
    }
}
