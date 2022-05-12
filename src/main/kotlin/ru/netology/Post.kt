package ru.netology

data class Post(
    val id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: List<Comment>,
    val copyright: String,
    val likes: Int?,
    val repost: Int,
    val views: Int?,
    val postType: String,
    val attachments: List<Attachment>,
    val signerId: Int = 0,
    val copyHistory: String,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut?,
    val postponedId: Int = 0,
)