package com.example.actividadproductos.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.actividadproductos.data.model.Product
import com.example.actividadproductos.data.model.ProductCategory
import com.example.actividadproductos.data.repository.ProductRepository
import kotlinx.coroutines.flow.StateFlow

class ProductViewModel : ViewModel() {
    val products: StateFlow<List<Product>> = ProductRepository.products

    fun registerProduct(
        name: String,
        priceString: String,
        category: ProductCategory
    ): Result<Unit> {
        val trimmedName = name.trim()
        if (trimmedName.isEmpty()) {
            return Result.failure(IllegalArgumentException("El nombre del producto no puede estar vacío."))
        }

        val price = priceString.toDoubleOrNull()
        if (price == null || price <= 0) {
            return Result.failure(IllegalArgumentException("Ingrese un precio válido y mayor a cero."))
        }

        val newProduct = Product(
            name = trimmedName,
            price = price,
            category = category
        )

        ProductRepository.addProduct(newProduct)
        return Result.success(Unit)
    }
}
