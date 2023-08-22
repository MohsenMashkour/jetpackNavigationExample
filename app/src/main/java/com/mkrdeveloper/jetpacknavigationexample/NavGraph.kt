package com.mkrdeveloper.jetpacknavigationexample

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Nav(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "A" ){
        composable("A"){
            ScreenA(navController)
        }
        composable("B"){
            ScreenB(navController)
        }
        composable("C"){
            ScreenC(navController)
        }

    }
}