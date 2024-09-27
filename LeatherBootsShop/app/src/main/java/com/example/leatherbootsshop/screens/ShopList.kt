package com.example.leatherbootsshop.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.leatherbootsshop.components.DrawerMenu
import com.example.leatherbootsshop.components.ProductCard
import com.example.leatherbootsshop.components.TopBar
import com.example.leatherbootsshop.models.Boot
import com.example.leatherbootsshop.models.FavoritesViewModel
import com.example.leatherbootsshop.ui.theme.ScreenColor
import kotlinx.coroutines.launch

@Composable
fun ShopList(navController: NavController, favoritesViewModel: FavoritesViewModel){
    val bootList = listOf(
        Boot(1, "Leather boots", 27.5, "Great warm shoes from the artificial leather. You can buy this model only in our shop", ""),
        Boot(2, "Modern Ankle Boot", 40.0, "Brown", ""),
        Boot(3, "Winter Snow Boot", 44.0, "White", ""),
        Boot(4, "Summer Hiking Boot", 41.0, "Green", ""),
        Boot(5, "Fashion High Boot", 39.0, "Red", "")
    )


    TopBar("Shop List", content = { ScreenContent(bootList, favoritesViewModel) }, navController, favoritesViewModel.favoriteBoots.size)


}


@Composable
private fun ScreenContent(bootList: List<Boot>, favoritesViewModel: FavoritesViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 80.dp)
            .background(ScreenColor)
            .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)
    ) {
        LazyColumn {
            items(bootList.size) {
                ProductCard(bootList[it], favoritesViewModel)
            }
        }
    }
}