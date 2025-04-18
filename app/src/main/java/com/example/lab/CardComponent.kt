package com.example.lab04

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CardComponent() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .size(width = 200.dp, height = 100.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Text(
            text = "Tarjeta de Película",
            modifier = Modifier.padding(16.dp)
        )
    }
}