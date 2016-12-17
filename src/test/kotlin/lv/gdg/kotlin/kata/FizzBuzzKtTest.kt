package lv.gdg.kotlin.kata

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class FizzBuzzKtTest {

    @Test fun shouldPrintNumber() {
        assertEquals ("1", fizzBuzz(1))
    }

    @Test fun shouldPrintFizz() {
        assertEquals ("Fizz", fizzBuzz(3))
        assertEquals ("Fizz", fizzBuzz(9))
    }

    @Test fun shouldPrintBuzz() {
        assertEquals("Buzz", fizzBuzz(5))
    }

    @Test fun shouldPrintFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz(30))
    }

    @Test
    fun shouldPrintFizz_ifContains3() {
        assertEquals("Fizz", fizzBuzz(13))
    }

    @Test
    fun shouldPrintFizz_ifContains5() {
        assertEquals("Buzz", fizzBuzz(25))
    }

    @Test
    fun shouldPrintFizz_ifContains3and5() {
        assertEquals("FizzBuzz", fizzBuzz(35))
    }

    @Test
    fun shouldReturnTrueIfFizz() {
        assertTrue(isFizz(3))
        assertTrue(isFizz(13))
    }

    @Test
    fun shouldReturnTrueIfBuzz() {
        assertTrue(isBuzz(5))
        assertTrue(isBuzz(25))
    }

}