package com.alexmumo.notification.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun HomeScreen() {
    Text(
        text = "Alex",
        modifier = Modifier.testTag("test")
    )
}

