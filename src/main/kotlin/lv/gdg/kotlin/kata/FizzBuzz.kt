package lv.gdg.kotlin.kata

fun fizzBuzz(num: Int) =
    "".appendFizz(num).appendBuzz(num).orElse(num)



fun  Int.containsNumber(i: Int)  = this % i == 0 || "$this".contains(i.toString())


private fun String.appendFizz(num: Int)  = this + if (num.containsNumber(3)) "Fizz" else ""

private fun String.appendBuzz(num: Int) = this + if (num.containsNumber(5)) "Buzz" else ""


private fun String.orElse(num: Int) = if(this.isEmpty()) "$num" else this
