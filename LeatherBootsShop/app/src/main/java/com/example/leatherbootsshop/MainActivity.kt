package com.example.leatherbootsshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.leatherbootsshop.models.FavoritesViewModel
import com.example.leatherbootsshop.screens.Favourites
import com.example.leatherbootsshop.screens.ShopList
import com.example.leatherbootsshop.ui.theme.LeatherBootsShopTheme

sealed class Screen(val route: String) {
    object ShopList : Screen("Shop List")
    object Favourites : Screen("Favourites")
    object Leatherboots : Screen("Leatherboots")
}

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LeatherBootsShopTheme {
                    val favoritesViewModel: FavoritesViewModel = viewModel()
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Screen.ShopList.route) {
                        composable(Screen.ShopList.route) { ShopList(navController, favoritesViewModel) }
                        composable(Screen.Favourites.route) { Favourites(navController, favoritesViewModel) }
                        composable(Screen.Leatherboots.route) {  }
                    }
            }
        }
    }
}