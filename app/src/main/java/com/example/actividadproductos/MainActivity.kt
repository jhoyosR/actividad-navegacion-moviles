package com.example.actividadproductos

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.actividadproductos.ui.theme.ActividadProductosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActividadProductosTheme {
                HomeScreen(
                    navigateToRegisterProduct = {
                        startActivity(Intent(this, RegisterProductActivity::class.java))
                    },
                    navigateToProducts = {
                        startActivity(Intent(this, ProductsActivity::class.java))
                    }
                )
            }
        }
    }
}
