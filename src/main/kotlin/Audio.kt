class Audio(override val type: String, override val govno: String) : Attachment {
}

class AudioAttachment(val audio: Audio,
    val id: Int,
    val owner_id: Int,
    val artist: String,
    val title: String,
    val duration: Int) {

}