package ru.netology

data class Comment(
    internal val commentId: Int,
    internal val postId: Int,
    internal val fromId: Int,
    internal val date: Int,
    internal val text: String,
    internal val donut: Donut?,
    internal val isDon: Boolean,
    internal val replyToUser: Int,
    internal val replyToComment: Int,
    internal val attachments: Array<Attachment>,
)