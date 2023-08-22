package com.mkrdeveloper.jetpacknavigationexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.mkrdeveloper.jetpacknavigationexample.ui.theme.JetpackNavigationExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackNavigationExampleTheme {
                val navController = rememberNavController()
                Nav(navController)
            }
        }
    }
}

