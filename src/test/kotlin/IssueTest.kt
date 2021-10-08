import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class IssueTest {

    @Test
    fun `will silently be skipped`() = runBlocking {
        launch { doSomething() }
    }

    @Test
    fun `should pass`() = runBlocking {
        doSomething()
    }

    private fun doSomething() {
        println("Hello, World!")
    }
}