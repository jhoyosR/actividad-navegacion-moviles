package com.example.actividadproductos

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.actividadproductos.ui.theme.ActividadProductosTheme

class ProductsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActividadProductosTheme {
                ProductsScreen(
                    onBackClick = { finish() },
                    navigateToRegister = {
                        startActivity(Intent(this, RegisterProductActivity::class.java))
                        finish()
                    }
                )
            }
        }
    }
}
