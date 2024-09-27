package com.example.leatherbootsshop.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.leatherbootsshop.utils.navigateTo

@Composable
fun DrawerMenu(navController: NavController, favouritesCount: Int) {
    val selectedItem = remember { mutableStateOf("Shop list") }
    Column(modifier = Modifier
        .width(360.dp)
        .height(360.dp),
        verticalArrangement = Arrangement.Top, //.background(MenuColor) -Facu tiene este componente
        horizontalAlignment = Alignment.Start
    ) {

        InfoItem(text = "Title")
        InfoItem(text = "Section Header")

        Row{
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                ItemMenu(settingsText = "Shop list", ico = "circle", number = null, isSelected = selectedItem.value == "Shop list", onClick = { navigateTo(navController, "Shop List") })
                ItemMenu(settingsText = "Favourites", ico = "triangle", number = favouritesCount, isSelected = selectedItem.value == "Favourites", onClick = { navigateTo(navController, "Favourites")})
                ItemMenu(settingsText = "Profile", ico = "square", number = null, isSelected = selectedItem.value == "Profile", onClick = {  })
                ItemMenu(settingsText = "Settings", ico = "pentagon", number = null, isSelected = selectedItem.value == "Settings", onClick = {  })

            }
        }

    }
}