data class Comment(
    val id: Int ,
    val postId: Int ,
    val date: Int ,
    val text: String ,
    val attachment: List<Attachment>

) {
    override fun toString(): String {
        return "id = $id, fromId = $postId, date = $date, text = $text"
    }

}

