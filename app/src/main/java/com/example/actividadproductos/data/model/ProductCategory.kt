package com.example.actividadproductos.data.model

import androidx.annotation.DrawableRes
import com.example.actividadproductos.R

enum class ProductCategory(
    val displayName: String,
    @DrawableRes val iconRes: Int
) {
    TECNOLOGIA("Tecnología", R.drawable.ic_technology),
    ROPA("Ropa", R.drawable.ic_clothing),
    ALIMENTOS("Alimentos", R.drawable.ic_food),
    HOGAR("Hogar", R.drawable.ic_home)
}
