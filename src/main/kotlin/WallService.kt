object WallService {

    var posts = emptyArray<Post>()
    private var postId = 1

    fun add(post: Post): Post {
        posts += post.copy(id = postId)
        postId++
        return post
    }

    fun update(post: Post): Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (postInArray.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
        postId = 1
    }
}