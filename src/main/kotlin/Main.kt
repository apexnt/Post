fun main() {
    val firstPost = Post(
        ownerId = 549 ,
        fromId = 10 ,
        createdBy = 554 ,
        date = 2022_04_05 ,
        text = "First post" ,
        replyOwnerId = 0 ,
        replyPostId = 0 ,
        friendsOnly = false ,
        comments = emptyList() ,
        copyright = "" ,
        likes = 2 ,
        reposts = null ,
        views = 2 ,
        postType = "" ,
        attachments = listOf(
            AudioAttachment(
                audio = Audio(25 , 45 , "Bob" , "Bobby" , 25)
            )
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

    val secondPost = Post(
        ownerId = 598 ,
        fromId = 0 ,
        createdBy = 26 ,
        date = 2022_04_28 ,
        text = "Second post" ,
        replyOwnerId = 0 ,
        replyPostId = 0 ,
        friendsOnly = false ,
        comments = emptyList() ,
        copyright = "" ,
        likes = 0 ,
        reposts = null ,
        views = 0 ,
        postType = "" ,
        attachments = emptyList() ,
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
        comments = emptyList() ,
        copyright = "" ,
        likes = 102 ,
        reposts = null ,
        views = 18 ,
        postType = "" ,
        attachments = listOf(
            VideoAttachment(
                video = Video(12 , 25 , "Video" , "My Video" , 62)
            )
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
        id = 2 ,
        ownerId = 485 ,
        fromId = 148 ,
        createdBy = 1025 ,
        date = 2022_05_01 ,
        text = "Edited post" ,
        replyOwnerId = 0 ,
        replyPostId = 0 ,
        friendsOnly = false ,
        comments = emptyList() ,
        copyright = "" ,
        likes = 148 ,
        reposts = null ,
        views = 48 ,
        postType = "" ,
        attachments = listOf(
            DocumentAttachment(
                document = Document(12 , 23 , "Document" , 23)
            ) ,
            PhotoAttachment(
                photo = Photo(27 , 15 , 48 , 78 , "My photo")
            ) ,
            NoteAttachment(
                note = Note(12 , 12 , "Note" , "My note" , 12)
            )
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

    val firstComment = Comment(11 , 1 , 2022_05_09 , "Первый комментарий." , emptyList())
    val secondComment = Comment(22 , 2 , 2022_05_10 , "Второй комментарий" , emptyList())
    val thirdComment = Comment(33 , 3 , 2022_05_11 , "Третий комментарий" , emptyList())
    val fourthComment = Comment(44 , 4 , 2022_05_12 , "Четвертый комментарий" , emptyList())

    WallService.add(firstPost)
    WallService.add(secondPost)
    WallService.add(thirdPost)
    WallService.update(updatePost)
    WallService.printPosts()

    WallService.checkingCommentCreation(firstComment)
    WallService.checkingCommentCreation(secondComment)
    WallService.checkingCommentCreation(thirdComment)
    WallService.printComments()
    WallService.checkingCommentCreation(fourthComment)
}