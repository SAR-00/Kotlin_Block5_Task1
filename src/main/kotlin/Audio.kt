class Audio(override val type: String, val audio: Audio) : Attachment {
}

class AudioAttachment(val audio: Audio,
    val id: Int,
    val owner_id: Int,
    val artist: String,
    val title: String,
    val duration: Int) {

}