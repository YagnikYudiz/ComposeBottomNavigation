package com.example.composebottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(val route: String, var label: String, val icon: ImageVector) {

    object Home : Screens("Home", "Home", Icons.Default.Home)
    object Notification : Screens("Notification", "Notification", Icons.Default.Notifications)
    object Favorite : Screens("Favorite", "Favorite", Icons.Default.Favorite)
    object Setting : Screens("Setting", "Setting", Icons.Default.Settings)

    object Items {
        val items = listOf(
            Home, Notification, Favorite, Setting
        )
    }
}