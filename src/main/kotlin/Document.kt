data class Document(
    val id: Int ,
    val ownerId: Int ,
    val title: String ,
    val size: Int ,
) {
    override fun toString(): String {
        return "(id = $id, ownerId = $ownerId, title = $title, size = $size)"
    }
}