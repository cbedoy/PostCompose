package com.compose.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.compose.app.data.Post
import com.compose.app.data.Thumbnail
import com.compose.app.ui.theme.BlackPrimary
import com.compose.app.ui.theme.BlackSecondary

@Composable
fun PostContent(post: Post){
    Column {
        PostHeader(user = post.user)
        Spacer(modifier = Modifier.height(8.dp))
        when(post.thumbnail) {
            is Thumbnail.None -> {
                Text(text = post.text)
            }
            is Thumbnail.Link -> {
                Text(text = post.text)
                Image(
                    painter = rememberImagePainter(post.thumbnail.src),

                    contentDescription = "",
                    modifier = Modifier.size(260.dp)
                )
                Text(text = post.thumbnail.title, color = BlackPrimary)
                Text(text = post.thumbnail.description, color = BlackSecondary)
            }
            is Thumbnail.Image -> {
                Text(text = post.text)
                Image(
                    painter = rememberImagePainter(post.thumbnail.src),
                    contentDescription = "",
                    modifier = Modifier.size(260.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostNonePreview() {
    PostContent(nonePost)
}

@Preview(showBackground = true)
@Composable
fun PostImagePreview() {
    PostContent(linkPost)
}


@Preview(showBackground = true)
@Composable
fun PostLinkPreview() {
    PostContent(imagePost)
}

