package lv.gdg.kotlin.kata


/**
 * There are four types of common coins in US currency:
 * quarters (25 cents)
 * dimes (10 cents)
 * nickels (5 cents)
 * pennies (1 cent)
 *
 * There are 6 ways to make change for 15 cents:
 * A dime and a nickel;
 * A dime and 5 pennies;
 * 3 nickels;
 * 2 nickels and 5 pennies;
 * A nickel and 10 pennies;
 * 15 pennies.
 *
 * How many ways are there to make change for a dollar
 * using these common coins? (1 dollar = 100 cents).
 */

sealed class Coin(val value: Int) {
    class Quarter : Coin(25)
    class Dime : Coin(10)
    class Nickel : Coin(5)
    class Penny : Coin(1)
}

fun Int.getPossibleCoinCombinations(): List<List<Coin>> {
    return (1..6).map { listOf<Coin>() }
}

