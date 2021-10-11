package com.compose.app

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.app.data.User

@Composable
fun PostHeader(user: User, timestamp: Long = 0L) {
    Row {
        PostAvatar(user)
        Spacer(modifier = Modifier.width(4.dp))
        Column {
            Text(text = user.nickname, fontSize = 12.sp)
            Text(text = "Current date $timestamp", fontSize = 10.sp)
        }
    }
}

@Preview()
@Composable
fun HeaderPreview() {
    PostHeader(demoUser)
}