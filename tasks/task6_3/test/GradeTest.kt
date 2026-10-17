// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    @Test
    fun `Mark of 55 gives a Pass`() {
        assertEquals("Pass", grade(55))
    }
    @Test
    fun `Mark of 25 gives a Fail`() {
        assertEquals("Fail", grade(25))
    }
    @Test
    fun `Mark of 85 gives a Distinction`() {
        assertEquals("Distinction", grade(85))
    }
    @Test
    fun `Mark of 101 gives error`() {
        assertEquals("?", grade(101))
    }
    @Test
    fun `Mark of -1 gives error`() {
        assertEquals("?", grade(-1))
    }
}
