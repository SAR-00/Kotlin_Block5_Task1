fun main() {

    val comments = Comments()
    val likes = Likes()
    val post1 = Post(ownerId = 1, comments = comments, likes = likes)
    val post2 = Post(ownerId = 2, comments = comments, likes = likes)
    val post3 = Post(id = 0, ownerId = 3, comments = comments, likes = likes)

    WallService.add(post1)
    WallService.add(post2)
    println(WallService.posts.joinToString())

    WallService.update(post3)
    println(WallService.posts.joinToString())

}