package com.example.leatherbootsshop.utils

import androidx.navigation.NavController
import androidx.navigation.NavHostController

fun navigateTo(navController: NavController, destination: String) {
    navController.navigate(destination)
}