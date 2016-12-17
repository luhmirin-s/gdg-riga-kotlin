package lv.gdg.kotlin.kata

import lv.gdg.kotlin.kata.Coin.Dime
import lv.gdg.kotlin.kata.Coin.Nickel
import lv.gdg.kotlin.kata.Coin.Penny
import lv.gdg.kotlin.kata.Coin.Quarter
import org.junit.Assert.assertEquals
import org.junit.Test

class Task2KtTest {
    @Test
    fun getPossibleCoinCombinationsTest() {
        assertEquals(6, 15.getPossibleCoinCombinations().count())
    }

    @Test
    fun getCoinsCountByType() {
        assertEquals(2, 51.getCoins(Quarter()))
        assertEquals(2, 20.getCoins(Dime()))
        assertEquals(4, 20.getCoins(Nickel()))
        assertEquals(20, 20.getCoins(Penny()))
    }
}