package lv.gdg.kotlin.kata

import org.junit.Assert.assertEquals
import org.junit.Test

class Task2KtTest {
    @Test
    fun getPossibleCoinCombinationsTest() {
        assertEquals(6, 15.getPossibleCoinCombinations().count())
    }
}