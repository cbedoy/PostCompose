package com.compose.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.compose.app.data.User

@ExperimentalCoilApi
@Composable
fun PostAvatar(user: User) {
    Image(
        painter = rememberImagePainter(user.avatar),
        contentDescription = "resource",
        modifier = Modifier
            .size(36.dp)
            .clip(CircleShape)
    )
}

@Preview
@Composable
fun PostPreview() {
    PostAvatar(demoUser)
}