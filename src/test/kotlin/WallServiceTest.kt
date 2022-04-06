import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

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
                comments = Comment(
                    text = "" ,
                    count = 0 ,
                    canPost = false ,
                    groupsCanPost = false ,
                    canClose = false ,
                    canOpen = false
                ) ,
                copyright = "" ,
                likes = 2 ,
                reposts = Reposts(count = 0 , userReposted = true) ,
                views = 2 ,
                postType = "" ,
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
        WallService.add(Post(
            ownerId = 485 ,
            fromId = 10 ,
            createdBy = 554 ,
            date = 2022_04_05 ,
            text = "First post" ,
            replyOwnerId = 0 ,
            replyPostId = 0 ,
            friendsOnly = false ,
            comments = Comment(
                text = "" ,
                count = 0 ,
                canPost = false ,
                groupsCanPost = false ,
                canClose = false ,
                canOpen = false
            ) ,
            copyright = "" ,
            likes = 2 ,
            reposts = Reposts(count = 0 , userReposted = true) ,
            views = 2 ,
            postType = "" ,
            signerId = 0 ,
            canPin = false ,
            canDelete = false ,
            canEdit = false ,
            isPinned = false ,
            markedAsAds = false ,
            isFavorite = true ,
            postponedId = 0
        ))
        val update = Post(
            id = 1,
            ownerId = 485,
            fromId = 10,
            createdBy = 554,
            date = 2022_04_05 ,
            text = "Edited post" ,
            replyOwnerId = 0 ,
            replyPostId = 0 ,
            friendsOnly = false ,
            comments = Comment(
                text = "" ,
                count = 0 ,
                canPost = false ,
                groupsCanPost = false ,
                canClose = false ,
                canOpen = false
            ) ,
            copyright = "" ,
            likes = 15 ,
            reposts = Reposts(count = 0 , userReposted = true) ,
            views = 18 ,
            postType = "" ,
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
        WallService.add(Post(
            ownerId = 485 ,
            fromId = 10 ,
            createdBy = 554 ,
            date = 2022_04_05 ,
            text = "First post" ,
            replyOwnerId = 0 ,
            replyPostId = 0 ,
            friendsOnly = false ,
            comments = Comment(
                text = "" ,
                count = 0 ,
                canPost = false ,
                groupsCanPost = false ,
                canClose = false ,
                canOpen = false
            ) ,
            copyright = "" ,
            likes = 2 ,
            reposts = Reposts(count = 0 , userReposted = true) ,
            views = 2 ,
            postType = "" ,
            signerId = 0 ,
            canPin = false ,
            canDelete = false ,
            canEdit = false ,
            isPinned = false ,
            markedAsAds = false ,
            isFavorite = true ,
            postponedId = 0
        ))
        val update = Post(
            id = 1,
            ownerId = 485,
            fromId = 10,
            createdBy = 554,
            date = 2022_04_05 ,
            text = "Edited post" ,
            replyOwnerId = 0 ,
            replyPostId = 0 ,
            friendsOnly = false ,
            comments = Comment(
                text = "" ,
                count = 0 ,
                canPost = false ,
                groupsCanPost = false ,
                canClose = false ,
                canOpen = false
            ) ,
            copyright = "" ,
            likes = 15 ,
            reposts = Reposts(count = 0 , userReposted = true) ,
            views = 18 ,
            postType = "" ,
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
        assertFalse(result)
    }
}