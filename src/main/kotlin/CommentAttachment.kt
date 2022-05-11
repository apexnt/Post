data class CommentAttachment(
    override val type: String = "comment" ,
    val comment: Comment = Comment(1,1,1,"", emptyList())
) : Attachment
