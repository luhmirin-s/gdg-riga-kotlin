package lv.gdg.kotlin.kata

fun fizzBuzz(num: Int): String {
    return when {
        num % 3 == 0 -> "Fizz"
        else -> num.toString()
    }
}

