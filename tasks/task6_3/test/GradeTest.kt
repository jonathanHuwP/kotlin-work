// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    @Test
    fun `negative gives error`() {
        assertEquals("?", grade(-10))
    }

    @Test
    fun `tst illegal-fail boundary`() {
        assertEquals("?", grade(-1))
        assertEquals("Fail", grade(0))
        assertEquals("Fail", grade(1))
    }

    @Test
    fun `mid-range Fail`() {
        assertEquals("Fail", grade(25))
    }

    @Test
    fun `test fail-pass boundary`() {
        assertEquals("Fail", grade(39))
        assertEquals("Pass", grade(40))
        assertEquals("Pass", grade(41))
    }

    @Test
    fun `mid-range Pass`() {
        assertEquals("Pass", grade(55))
    }

    @Test
    fun `test pass-distinction boundary`() {
        assertEquals("Pass", grade(69))
        assertEquals("Distinction", grade(70))
        assertEquals("Distinction", grade(71))
    }

    @Test
    fun `mid-range Distinction`() {
        assertEquals("Distinction", grade(85))
    }

    @Test
    fun `test distinction-illegal boundary`() {
        assertEquals("Distinction", grade(99))
        assertEquals("Distinction", grade(100))
        assertEquals("?", grade(101))
    }


}
