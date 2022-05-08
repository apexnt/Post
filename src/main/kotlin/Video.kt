data class Video(
    val id: Int ,
    val ownerId: Int ,
    val title: String ,
    val description: String ,
    val duration: Int ,

) {
    override fun toString(): String {
        return "(id= $id, , ownerId= $ownerId, title = $title, description = $description, duration = $duration)"
    }
}
