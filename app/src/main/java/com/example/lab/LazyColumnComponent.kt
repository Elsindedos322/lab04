package com.example.lab04

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnComponent() {
    val items = listOf("Película 1", "Película 2", "Película 3", "Película 4")

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(items) { item ->
            Text(
                text = item,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}