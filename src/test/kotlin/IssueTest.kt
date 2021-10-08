import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import org.mockito.Mockito.verify

class IssueTest {

    @Test
    fun `will be silently skipped`() = runBlocking {
        launch { doSomething() }
    }

    @Test
    fun `also will be silently skipped`() = runBlocking {
        // This bug is not specific to Mockito but the bug is easily triggered by putting a verify() call at the end of a unit test
        val value = "anything"

        verify(value).toString()
    }

    @Test
    fun `should pass`() = runBlocking {
        doSomething()
    }

    private fun doSomething() {
        println("Hello, World!")
    }
}