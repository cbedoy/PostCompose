package com.compose.app

import com.compose.app.data.Post
import com.compose.app.data.Thumbnail
import com.compose.app.data.User

val demoUser = User(
    avatar = "https://media-exp1.licdn.com/dms/image/C5603AQHwVUrJXQ3-ng/profile-displayphoto-shrink_800_800/0/1627060141036?e=1639612800&v=beta&t=vBsvagvvTVUSGTzPfN07rEoIvfBF9fFVAyMXKC72eOk",
    nickname = "Carlos Bedoy"
)

val nonePost = Post(
    user = demoUser,
    text = "This is a none post",
    thumbnail = Thumbnail.None
)
val imagePost = Post(
    user = demoUser,
    text = "This is a image post",
    thumbnail = Thumbnail.Image(
        src = "https://avatars.githubusercontent.com/u/5570799?v=4"
    )
)
val linkPost = Post(
    user = demoUser,
    text = "This is link post",
    thumbnail = Thumbnail.Link(
        src = "https://avatars.githubusercontent.com/u/5570799?v=4",
        title = "Carlos A. Cervantes Bedoy",
        description = "Senior Android Developer @ Globant"
    )
)