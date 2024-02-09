class Photo(override val type: String, val photo: Photo) : Attachment {
}

class PhotoAttachment(val photo: Photo,
    val id: Int,
    val owner_id: Int,
    val user_id: Int,
    val text: String,
    val date: Int) {

}