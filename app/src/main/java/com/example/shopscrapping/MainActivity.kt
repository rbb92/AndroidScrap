package com.example.shopscrapping

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shopscrapping.ui.theme.ShopScrappingTheme
import com.example.shopscrapping.ui.ShopScrappingApp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShopScrappingTheme(dynamicColor = false, darkTheme = false) {
                // A surface container using the 'background' color from the theme
                Surface{
                    val windowSize = calculateWindowSizeClass(this)
                    ShopScrappingApp(
                        context = applicationContext,
                        windowSize = windowSize.widthSizeClass,
                    )
                }
            }
        }
    }
}
