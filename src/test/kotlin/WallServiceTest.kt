import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun createComment_True() {
        val post = WallService.add(
            Post(
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
        )
        val comment = Comment(11 , 1 , 2022_05_09 , "Первый комментарий." , emptyList())

        WallService.createComment(comment)

        assert(post.id == comment.postId)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
      WallService.add(
            Post(
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
        )
        val comment = Comment(11 , 4 , 2022_05_09 , "Первый комментарий." , emptyList())

        WallService.checkingCommentCreation(comment)

        shouldThrow()
    }

    @Test
    fun checkingCommentCreation_True() {
        WallService.add(
            Post(
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
        )

        val comment = Comment(11 , 1 , 2022_05_09 , "Первый комментарий." , emptyList())

        val result = WallService.checkingCommentCreation(comment)

        assertTrue(result)
    }

    @Test
    fun add() {
        val result = WallService.add(
            Post(
                ownerId = 485 ,
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
        )
        assertTrue(result.id != 0)
    }

    @Test
    fun updateTrue() {
        WallService.add(
            Post(
                ownerId = 485 ,
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
        )

        val update = Post(
            id = 1 ,
            ownerId = 485 ,
            fromId = 10 ,
            createdBy = 554 ,
            date = 2022_04_05 ,
            text = "Edited post" ,
            replyOwnerId = 0 ,
            replyPostId = 0 ,
            friendsOnly = false ,
            comments = emptyList() ,
            copyright = "" ,
            likes = 15 ,
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
        val result = WallService.update(update)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        WallService.add(
            Post(
                ownerId = 485 ,
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
        )

        val update = Post(
            id = 1 ,
            ownerId = 485 ,
            fromId = 10 ,
            createdBy = 554 ,
            date = 2022_04_05 ,
            text = "Edited post" ,
            replyOwnerId = 0 ,
            replyPostId = 0 ,
            friendsOnly = false ,
            comments = emptyList() ,
            copyright = "" ,
            likes = 15 ,
            reposts = null ,
            views = 18 ,
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
        val result = WallService.update(update)
        assertFalse(!result)
    }
}