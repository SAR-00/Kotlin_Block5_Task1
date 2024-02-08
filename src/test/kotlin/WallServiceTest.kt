import org.junit.Test
import org.junit.Before
import kotlin.test.assertEquals

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun addTest() {
        val comments = Comments()
        val likes = Likes()
        var post = Post(comments = comments, likes = likes)

        WallService.add(post)
        post = WallService.posts[0]

        val result = post.id

        assertEquals(1, result)
    }

    @Test
    fun updateTest_True() {
        val comments = Comments()
        val likes = Likes()
        val post1 = Post(comments = comments, likes = likes)

        WallService.add(post1)

        val post2 = Post(id = 1, comments = comments, likes = likes)
        val result = WallService.update(post2)

        assertEquals(true, result)
    }

    @Test
    fun updateTest_False() {
        val comments = Comments()
        val likes = Likes()
        val post1 = Post(comments = comments, likes = likes)

        WallService.add(post1)

        val post2 = Post(id = 2, comments = comments, likes = likes)
        val result = WallService.update(post2)

        assertEquals(false, result)
    }
}


