object WallService {
    private var posts = mutableListOf<Post>()
    private var lastId = 1
    private var comments = mutableListOf<Comment>()

    fun createComment(comment: Comment): Boolean {
        for (post: Post in posts) {
            if (post.id == comment.postId) {
                comments.add(comment)
                return true
            }
        }
        return false
    }

    fun checkingCommentCreation(comment: Comment): Boolean {
        if (!createComment(comment)) {
            throw PostNotFoundException("Поста с таким Id не существует!")
        }
        return true
    }

    fun printComments() {
        for ((index, value) in comments.withIndex()) {
            println("Значение индекса $index содержимое $value")
        }
    }

    fun add(post: Post): Post {
        post.id = lastId++
        posts.plusAssign(post)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (i: Int in 0..posts.size) {
            val searchPost = posts[i]
            if (post.id == searchPost.id) {
                val updatePost = post.copy(id = searchPost.id , ownerId = searchPost.ownerId , date = searchPost.date)
                posts[i] = updatePost
                return true
            }
        }
        return false
    }

    fun printPosts() {
        for ((index , value) in posts.withIndex()) {
            println("Значение индекса $index содержимое $value")
            println("\tвложения:")
            for (att: Attachment in value.attachments!!) {
                when (att.type) {
                    "note" -> println("\t\tNote")
                    "photo" -> println("\t\tPhoto")
                    "document" -> println("\t\tDocument")
                    "audio" -> println("\t\tAudio")
                    "video" -> println("\t\tVideo")
                    else -> println("\t\tunknown")
                }
            }
        }
    }
}


