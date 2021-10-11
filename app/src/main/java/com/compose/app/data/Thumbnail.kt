package com.compose.app.data

sealed class Thumbnail {

    object None: Thumbnail()

    data class Link(
        val src: String = "",
        val title: String = "",
        val description : String = ""
    ): Thumbnail()

    data class Image(
        val src: String = ""
    ): Thumbnail()
}