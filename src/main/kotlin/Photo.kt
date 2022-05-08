data class Photo(
    val id: Int ,
    val albumId: Int ,
    val ownerId: Int ,
    val userId: Int ,
    val text: String ,
) {
    override fun toString(): String {
        return "(id= $id, albumId= $albumId, ownerId= $ownerId, userId= $userId, text = $text)"
    }
}

