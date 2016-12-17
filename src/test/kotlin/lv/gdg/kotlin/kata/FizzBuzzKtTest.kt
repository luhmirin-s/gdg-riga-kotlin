package lv.gdg.kotlin.kata

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzKtTest {

    @Test fun shouldPrintNumber() {
        assertEquals ("1", fizzBuzz(1))
    }

    @Test fun shouldPrintFizz() {
        assertEquals ("Fizz", fizzBuzz(3))
    }

    @Test fun shouldPrintBuzz() {
        assertEquals("Buzz", fizzBuzz(5))
    }

    @Test fun shouldPrintFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz(30))
    }
}