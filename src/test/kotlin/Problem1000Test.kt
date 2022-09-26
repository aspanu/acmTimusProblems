import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Problem1000Test {

    @Test
    fun testProblem() {
        val problem = Problem1000()
        val input = "1 5"
        val output = problem.run(input)
        assertEquals(5, output)
    }
}