package lv.gdg.kotlin.kata

fun fizzBuzz(num: Int): String {
    return when {
        num % 15 == 0 -> "FizzBuzz"
        num % 3 == 0 -> "Fizz"
        num % 5 == 0 -> "Buzz"
        else -> num.toString()
    }
}

