class Video(override val type: String, override val govno: String): Attachment {
}

class VideoAttachment(val video: Video,
    val id: Int,
    val owner_id: Int,
    val title: String,
    val description: String,
    val duration: Int) {

}