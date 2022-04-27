object WallService {
    private var posts = mutableListOf<Post>()
    private var lastId = 1

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
            for (att: Attachment in value.attachments) {
                when (att.type) {
                    "Note" -> println("\t\tNote")
                    "Photo" -> println("\t\tPhoto")
                    "Document" -> println("\t\tDocument")
                    "Audio" -> println("\t\tAudio")
                    "Video" -> println("\t\tVideo")
                    else -> println("\t\tunknown")
                }
            }
        }
    }
}


