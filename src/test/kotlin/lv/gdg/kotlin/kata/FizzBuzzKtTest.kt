package lv.gdg.kotlin.kata

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzKtTest {

//    assertEquals ("Buzz", fizzBuzz(5))
//    assertEquals ("FizzBuzz", fizzBuzz(5))
    @Test fun shouldPrintNumber() {
        assertEquals ("1", fizzBuzz(1))
    }

    @Test fun shouldPrintFizz() {
        assertEquals ("Fizz", fizzBuzz(3))
    }
}