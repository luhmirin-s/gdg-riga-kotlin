package lv.gdg.kotlin.kata

fun fizzBuzz(num: Int): String {
    return when {
        num.toString().contains('5') && num.toString().contains('3') -> "FizzBuzz"
        num % 15 == 0 -> "FizzBuzz"
        num % 5 == 0 -> "Buzz"

        num.toString().contains('5') -> "Buzz"
        num.toString().contains('3') -> "Fizz"
        else -> num.toString()
    }

}


 fun isFizz(i: Int) = i % 3 == 0 || "$i".contains('3')

 fun isBuzz(i: Int) = i % 5 == 0 || "$i".contains('5')
