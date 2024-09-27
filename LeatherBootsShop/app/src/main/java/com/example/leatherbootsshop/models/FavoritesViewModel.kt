package com.example.leatherbootsshop.models

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class FavoritesViewModel : ViewModel() {
    val favoriteBoots = mutableStateListOf<Boot>()

    fun addToFavorites(boot: Boot) {
        if (!favoriteBoots.contains(boot)) {
            favoriteBoots.add(boot)
        }
    }
}