import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    @Test
    fun markOfNegative5IsInvalid() {
        assertEquals("?", grade(-5))
    }

    @Test
    fun markOfNegative1IsInvalid() {
        assertEquals("?", grade(-1))
    }

    @Test
    fun markOf0GivesFail() {
        assertEquals("Fail", grade(0))
    }

    @Test
    fun markOf20GivesFail() {
        assertEquals("Fail", grade(20))
    }

    @Test
    fun markOf39GivesFail() {
        assertEquals("Fail", grade(39))
    }

    @Test
    fun markOf40GivesPass() {
        assertEquals("Pass", grade(40))
    }

    @Test
    fun markOf55GivesPass() {
        assertEquals("Pass", grade(55))
    }

    @Test
    fun markOf69GivesPass() {
        assertEquals("Pass", grade(69))
    }

    @Test
    fun markOf70GivesDistinction() {
        assertEquals("Distinction", grade(70))
    }

    @Test
    fun markOf85GivesDistinction() {
        assertEquals("Distinction", grade(85))
    }

    @Test
    fun markOf100GivesDistinction() {
        assertEquals("Distinction", grade(100))
    }

    @Test
    fun markOf101IsInvalid() {
        assertEquals("?", grade(101))
    }

    @Test
    fun markOf105IsInvalid() {
        assertEquals("?", grade(105))
    }
}