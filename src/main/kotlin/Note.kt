data class Note(
    val id: Int ,
    val ownerId: Int ,
    val title: String ,
    val text: String ,
    val comments: Int
) {
    override fun toString(): String {
        return "(id = $id, ownerId = $ownerId, title = $title, text = $text, comments = $comments)"
    }
}
