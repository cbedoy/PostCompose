package com.compose.app.data

data class Post(
    val user: User,
    val text: String,
    val thumbnail: Thumbnail
)