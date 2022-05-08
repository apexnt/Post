data class Audio(
    val id: Int ,
    val ownerId: Int ,
    val artist: String ,
    val title: String ,
    val duration: Int ,
) {
    override fun toString(): String {
        return "(id = $id, ownerId = $ownerId, artist = $artist, title = $title, duration = $duration)"
    }
}

