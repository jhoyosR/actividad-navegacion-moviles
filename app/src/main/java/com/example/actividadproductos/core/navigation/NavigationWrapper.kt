package com.example.actividadproductos.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.actividadproductos.HomeScreen
import com.example.actividadproductos.ProductsScreen
import com.example.actividadproductos.RegisterProductScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home) {
        composable<Home> {
            HomeScreen(
                navigateToRegisterProduct = { navController.navigate(RegisterProduct) },
                navigateToProducts = { navController.navigate(Products) }
            )
        }
        composable<RegisterProduct> {
            RegisterProductScreen(
                onBackClick = { navController.popBackStack() },
                navigateToProducts = { navController.navigate(Products) }
            )
        }
        composable<Products> {
            ProductsScreen(
                onBackClick = { navController.popBackStack() },
                navigateToRegister = { navController.navigate(RegisterProduct) }
            )
        }
    }
}
