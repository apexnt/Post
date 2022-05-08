data class VideoAttachment(
    override val type: String = "video" ,
    val video: Video = Video(0,0,"", "", 0)
) : Attachment
