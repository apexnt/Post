fun main() {
    val firstPost = Post(
        ownerId = 485 ,
        fromId = 10 ,
        createdBy = 554 ,
        date = 2022_04_05 ,
        text = "First post" ,
        replyOwnerId = 0 ,
        replyPostId = 0 ,
        friendsOnly = false ,
        comments = "" ,
        copyright = "" ,
        likes = 2 ,
        reposts = null ,
        views = 2 ,
        postType = "" ,
        attachments = emptyList() ,
        signerId = 0 ,
        canPin = false ,
        canDelete = false ,
        canEdit = false ,
        isPinned = false ,
        markedAsAds = false ,
        isFavorite = true ,
        postponedId = 0
    )

    val secondPost = Post(
        ownerId = 598 ,
        fromId = 0 ,
        createdBy = 26 ,
        date = 2022_04_28 ,
        text = "Second post" ,
        replyOwnerId = 0 ,
        replyPostId = 0 ,
        friendsOnly = false ,
        comments = "" ,
        copyright = "" ,
        likes = 0 ,
        reposts = null ,
        views = 0 ,
        postType = "" ,
        attachments = listOf(
            Note(
                1 , 123 , "Note1" , "First note" , 2022_04_28 , 1
            ) ,
            Document(
                22 , 123 , "Manual" , 55 , "www.netology.ru" , 2022_04_27
            )
        ) ,
        signerId = 0 ,
        canPin = false ,
        canDelete = false ,
        canEdit = false ,
        isPinned = false ,
        markedAsAds = false ,
        isFavorite = false ,
        postponedId = 0
    )

    val thirdPost = Post(
        ownerId = 323 ,
        fromId = 99 ,
        createdBy = 956 ,
        date = 2022_04_30 ,
        text = "Third post" ,
        replyOwnerId = 0 ,
        replyPostId = 0 ,
        friendsOnly = false ,
        comments = "" ,
        copyright = "" ,
        likes = 102 ,
        reposts = null ,
        views = 18 ,
        postType = "" ,
        attachments = listOf<Attachment>(
            Photo(111 , 121 , 559 , 13 , "Photo" , 2022_04_27) ,
            Video(25 , 222 , "Video" , "My video" , 353 , 2022_04_25 , 38) ,
            Note(256 , 125 , "Note2" , "My note" , 2022_04_18 , 0)
        ) ,
        signerId = 0 ,
        canPin = false ,
        canDelete = false ,
        canEdit = false ,
        isPinned = false ,
        markedAsAds = false ,
        isFavorite = true ,
        postponedId = 0
    )

    val updatePost = Post(
        id = 3 ,
        ownerId = 485 ,
        fromId = 148 ,
        createdBy = 1025 ,
        date = 2022_05_01 ,
        text = "Edited post" ,
        replyOwnerId = 0 ,
        replyPostId = 0 ,
        friendsOnly = false ,
        comments = "" ,
        copyright = "" ,
        likes = 148 ,
        reposts = null ,
        views = 48 ,
        postType = "" ,
        attachments = emptyList() ,
        signerId = 0 ,
        canPin = false ,
        canDelete = false ,
        canEdit = false ,
        isPinned = false ,
        markedAsAds = false ,
        isFavorite = true ,
        postponedId = 0
    )


    WallService.add(firstPost)
    WallService.add(secondPost)
    WallService.add(thirdPost)
    WallService.update(updatePost)
    WallService.printPosts()

}