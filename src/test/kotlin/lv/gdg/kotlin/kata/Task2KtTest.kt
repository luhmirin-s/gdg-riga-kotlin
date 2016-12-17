package lv.gdg.kotlin.kata

import lv.gdg.kotlin.kata.Coin.Dime
import lv.gdg.kotlin.kata.Coin.Nickel
import lv.gdg.kotlin.kata.Coin.Penny
import lv.gdg.kotlin.kata.Coin.Quarter
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class Task2KtTest {
    @Test
    fun getPossibleCoinCombinationsTest() {
        assertEquals(6, 15.getPossibleCoinCombinations().count())
    }

    @Test
    fun getCoinsCountByType() {
        assertEquals(2, 51.getCoins(Quarter))
        assertEquals(2, 20.getCoins(Dime))
        assertEquals(4, 20.getCoins(Nickel))
        assertEquals(20, 20.getCoins(Penny))
    }

    @Test
    fun getChangeAfterType() {
        assertEquals((2 to 1), 51.getChange(Quarter))
        assertEquals((5 to 1), 51.getChange(Dime))
        assertEquals((10 to 1), 51.getChange(Nickel))
        assertEquals((51 to 0), 51.getChange(Penny))
    }

    @Test
    fun getPenniesTest(){
        assertListEquals(listOf(Penny, Penny, Penny, Penny, Penny), 5.getPennies())
    }

    private fun assertListEquals(listOf: List<Penny>, pennies: List<Penny>) {
        assertTrue(listOf.zip(pennies).any{p-> p.first != p.second})
    }

}