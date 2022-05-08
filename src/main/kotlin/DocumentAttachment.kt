data class DocumentAttachment(
    override val type: String = "document" ,
    val document: Document = Document(1,1,"",1)
) : Attachment

